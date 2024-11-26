package SCI.Iteratius;

import java.util.Scanner;

public class pt28BanderaSantJordi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n >= 0 || n % 2 != 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (n / 2 == i) System.out.print("- ");
                    else if (n / 2 == j) System.out.print("| ");
                    else System.out.print("% ");
                }
                System.out.println();
            }
        }
    }
}