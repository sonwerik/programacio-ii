package POO.Correcccions.Exercici9;

public class TestInundacions {
    public static void main(String[] args) {
        // Crear zones d'evacuació
        ZonaEvacuacio zona1 = new ZonaEvacuacio("Pavelló Central", 50);
        ZonaEvacuacio zona2 = new ZonaEvacuacio("Escola Nova", 30);

        zona1.afegirPersonaEvacuada("Joan Garcia");
        zona1.afegirPersonaEvacuada("Anna Martínez");

        // Crear equips d'emergència
        EquipEmergencia equip1 = new EquipEmergencia("Rescat 1", "Rescat");
        equip1.afegirMembre("Albert López");
        equip1.afegirMembre("Carla Torres");

        EquipEmergencia equip2 = new EquipEmergencia("Assistència Mèdica", "Mèdica");
        equip2.afegirMembre("Dr. Martí");
        equip2.afegirMembre("Infermera Laura");

        // Crear inundació
        Inundacio inundacio = new Inundacio(3.5, "2024-12-01");
        inundacio.afegirZonaEvacuacio(zona1);
        inundacio.afegirZonaEvacuacio(zona2);
        inundacio.afegirEquipEmergencia(equip1);
        inundacio.afegirEquipEmergencia(equip2);

        // Mostrar informació de la inundació
        System.out.println("Detall de la inundació:");
        System.out.println(inundacio);

        // Generar alerta
        double llindar = 2.5;
        if (inundacio.generarAlerta(llindar)) {
            System.out.println("ALERTA: La profunditat de l'aigua supera el llindar de " + llindar + " metres!");
        } else {
            System.out.println("No hi ha cap alerta. La profunditat és inferior al llindar.");
        }
    }
}
