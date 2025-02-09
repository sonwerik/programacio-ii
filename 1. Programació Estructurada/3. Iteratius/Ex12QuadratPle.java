package SCI.Iteratius;

import java.util.Scanner;

public class pt12QuadratPle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n >= 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < n; j++) {
                    System.out.print("*");
                }
                System.out.println("*");
            }
        } else System.out.println("N ha de ser NO negatiu");
    }
}
