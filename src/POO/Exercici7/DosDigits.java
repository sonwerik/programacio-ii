package POO.Exercici7;

import POO.Exercici6.Comptador;

import java.util.Scanner;

public class DosDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Comptador digit1 = new Comptador();
        ComptadorSegonDigit digit2 = new ComptadorSegonDigit();

        boolean continuar = true;
        while (continuar) {

            System.out.println("\n1. Consultar el primer digit");
            System.out.println("2. Consultar el segon digit");
            System.out.println("3. Icrementa el primer digit");
            System.out.println("4. Incremena el segon digit");
            System.out.println("5. Reseteja el primer digit");
            System.out.println("6. Reseteja el segon digit");
            System.out.println("7. Consulta ambdos digits");
            System.out.println("8. Incrementa ambdos digits");
            System.out.println("9. Reseteja ambdos digits");
            System.out.println("0. Sortir");
            System.out.print("Escull una opció: ");
            int opcio = sc.nextInt();
            switch (opcio) {
                case 1:
                    System.out.println("Valor actual del primer digit: " + digit1.consultar());
                    break;
                case 2:
                    System.out.println("Valor actual del segon digit: " + digit2.consultarSegonDigit());
                    break;
                case 3:
                    digit1.incrementar();
                    System.out.println("Valor incrementat.");
                    break;
                case 4:
                    digit2.incrementarSegonDigit();
                    System.out.println("Valor incrementat.");
                case 5:
                    digit1.reset();
                    System.out.println("Valor resetejat.");
                    break;
                case 6:
                    digit2.resetSegonDigit();
                    System.out.println("Valor resetejat.");
                    break;
                case 7:
                    System.out.println("Valor actual del primer digit: " + digit1.consultar());
                    System.out.println("Valor actual del segon digit: " + digit2.consultarSegonDigit());
                    break;
                case 8:
                    digit1.incrementar();
                    digit2.incrementarSegonDigit();
                    System.out.println("Valor incrementat.");
                    break;
                case 9:
                    digit1.reset();
                    digit2.resetSegonDigit();
                    System.out.println("Valor resetejat.");
                    break;
                case 0:
                    System.out.println("Sortint del programa.");
                    continuar = false;
                default:
                    System.out.println("Opció no vàlida. Torna a intentar-ho.");
                    break;
            }
        }
    }
}