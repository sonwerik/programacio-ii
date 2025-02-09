package SCI.Condicionals;

import java.util.Scanner;

public class pt6DiaDeLaSetmana {
    public static void main(String[] ignoredArgs) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n >= 1 && n <= 7) {
            if (n == 1) {
                System.out.println("Dilluns");
            } else if (n == 2) {
                System.out.println("Dimarts");
            } else if (n == 3) {
                System.out.println("Dimecres");
            } else if (n == 4) {
                System.out.println("Dijous");
            } else if (n == 5) {
                System.out.println("Divendres");
            } else if (n == 6) {
                System.out.println("Dissabte");
            } else {
                System.out.println("Diumenge");
            }
        } else {
            System.out.println("Dia no valid");
        }
    }
}
