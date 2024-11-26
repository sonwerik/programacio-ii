package SCI.Iteratius;

import java.util.Scanner;

public class pt14LaCreu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n < 0 || n % 2 == 0) System.out.println("N ha de ser imparell i positiu");
        else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j || i + j == n -1) System.out.print("* ");
                    else System.out.print("  ");
                }
                System.out.println();
            }
       }
    }
}