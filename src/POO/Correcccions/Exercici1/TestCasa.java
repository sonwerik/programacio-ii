package POO.Correcccions.Exercici1;

public class TestCasa {
    public static void main(String[] args) {
        // Creació de casos de prova
        Casa casa1 = new Casa();
        casa1.setSuperficie(120.5);
        casa1.setDireccio("Carrer Major, 5");

        Sala sala1 = new Sala();
        sala1.setNumeroDeTelevisions(2);
        sala1.setTipusSala("estar");

        Cuina cuina1 = new Cuina();
        cuina1.setEsIndependent(true);
        cuina1.setNombreDeFogons(4);

        casa1.setSalaCasa(sala1);
        casa1.setCuinaCasa(cuina1);

        System.out.println(casa1);

        // Segona casa
        Casa casa2 = new Casa();
        casa2.setSuperficie(80.0);
        casa2.setDireccio("Carrer Nou, 10");
        System.out.println(casa2);
    }
}