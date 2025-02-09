package POO.Activitats2.Solucions.Ex1.Casa;

// Classe POO.ProjecteNadal.Test per provar les classes
public class TestCasa {
    public static void main(String[] ignoredArgs) {
        // Crear casa amb valors per defecte
        Casa casa1 = new Casa();
        System.out.println("Casa amb valors per defecte:");
        System.out.println(casa1);

        // Crear sala i cuina personalitzades
        Sala sala2 = new Sala(2, "Sala d'estar");
        Cuina cuina2 = new Cuina(true, 4);

        // Crear casa amb sala i cuina personalitzades
        Casa casa2 = new Casa(150.5, "Carrer Major, 10", sala2, cuina2);
        System.out.println("\nCasa amb sala i cuina personalitzades:");
        System.out.println(casa2);
    }
}
