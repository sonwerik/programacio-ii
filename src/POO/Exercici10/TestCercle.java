package POO.Exercici10;

public class TestCercle {
    public static void main(String[] args) {
        Cercle cercle1 = new Cercle(5);
        Cercle cercle2 = new Cercle(7);

        System.out.println(cercle1);
        System.out.println(cercle2);
        System.out.println("El Cercle 1 és més gran que el Cercle 2: " + cercle1.esMesGranQue(cercle2));
    }
}
