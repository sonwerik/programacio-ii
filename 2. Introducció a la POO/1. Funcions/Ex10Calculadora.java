package Funcions;

import java.util.Objects;
import java.util.Scanner;

public class Ex10Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("Introdueix un nombre operant: ");
            int n1 = sc.nextInt();
            System.out.print("Introdueix un segon operant: ");
            int n2 = sc.nextInt();

            System.out.print("Quina operació vols realitar? ");
            int operacio = sc.nextInt();

            switch (operacio){
                case 1:
                    System.out.println(suma(n1, n2));
                    break;
                case 2:
                    System.out.println(resta(n1, n2));
                    break;
                case 3:
                    System.out.println(multiplicacio(n1, n2));
                    break;
                case 4:
                    System.out.println(divisio(n1, n2));
                    break;
                default:
                    System.out.println("Operació no vàlida.");
            }

            System.out.print("Vols seguir? (S/N): ");
            String seguir = sc.next().toUpperCase();
            if (!seguir(seguir)) break;
        }
    }

    public static int suma(int a, int b) {
        return a + b;
    }
    public static int resta(int a, int b) {
        return a - b;
    }
    public static int multiplicacio(int a, int b) {
        return a * b;
    }
    public static float divisio(int a, int b) {
        if (b == 0) {
            System.out.println("No es pot dividir per zero.");
            return 0;
        }
        return (float) a / b;
    }
    public static boolean seguir(String seguir) {
        while (!Objects.equals(seguir, "S") && !Objects.equals(seguir, "N")) {
            System.out.println("Si us plau, respon ❝S❞ per continuar o ❝N❞ per sortir.");
            Scanner sc = new Scanner(System.in);
            System.out.print("Vols seguir? (S/N): ");
            seguir = sc.next().toUpperCase();
        }
        return Objects.equals(seguir, "S");
    }
}