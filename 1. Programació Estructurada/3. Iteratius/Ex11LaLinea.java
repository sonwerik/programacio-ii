package SCI.Iteratius;

import java.util.Scanner;

public class pt11LaLinea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nombre = sc.nextInt();

        if (nombre >= 0) {
            for (int i = 0; i < nombre; i++) {
                System.out.print("*");
            }
        } else System.out.println("N ha de ser NO negatiu");
    }
}
