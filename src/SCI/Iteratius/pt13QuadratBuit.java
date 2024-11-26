package SCI.Iteratius;

import java.util.Scanner;

public class pt13QuadratBuit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
            for (int i = 2; i < n; i++) {
                System.out.print("*");
                for (int j = 2; j < n; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
        } else System.out.println("N ha de ser NO negatiu");
    }
}
