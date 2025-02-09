package SCI.Iteratius;

import java.util.Scanner;

public class pt29Piramide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 0 && n % 2 != 0) {
            for (int i = 0; i < n / 2 + 1; i++) {
                for (int j = 0; j < n; j++) {
                    if (j < n / 2 + 1 - i - 1) System.out.print(" ");
                    else if (j < n / 2 + 1 + i) System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}