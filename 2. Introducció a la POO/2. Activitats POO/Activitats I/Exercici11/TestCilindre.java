package POO.Activitats1.Exercici11;

public class TestCilindre {
    public static void main(String[] args) {
        Cilindre cilindre1 = new Cilindre(5, 10);
        Cilindre cilindre2 = new Cilindre(7, 8);

        System.out.println(cilindre1);
        System.out.println(cilindre2);

        if (cilindre1.esMesGranQue(cilindre2)) {
            System.out.println("El Cilindre 1 és més gran que el Cilindre 2.");
        } else {
            System.out.println("El Cilindre 2 és més gran que el Cilindre 1.");
        }
    }
}