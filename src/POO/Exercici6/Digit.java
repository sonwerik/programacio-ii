package POO.Exercici6;

import java.util.Scanner;

public class Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ComptadorCiclic digit = new ComptadorCiclic();

        boolean continuar = true;
        while (continuar) {

            System.out.println("\n1. Consultar el digit");
            System.out.println("2. Incremena el digit");
            System.out.println("3. Reseteja el digit");
            System.out.print("Escull una opció: ");
            int opcio = sc.nextInt();
            switch (opcio) {
                case 1:
                    System.out.println("Valor actual del digit: " + digit.consultar());
                    break;
                case 2:
                    digit.incrementar();
                    System.out.println("Valor ha incrementat. Consulti el digit per comprovar-ho.");
                    break;
                case 3:
                    digit.reset();
                    System.out.println("Valor ha resetejat. Consulti el digit per comprovar-ho.");
                    break;
                case 4:
                    System.out.println("Sortint del programa.");
                    continuar = false;
                default:
                    System.out.println("Opció no vàlida. Torna a intentar-ho.");
                    break;
            }
        }
    }
}