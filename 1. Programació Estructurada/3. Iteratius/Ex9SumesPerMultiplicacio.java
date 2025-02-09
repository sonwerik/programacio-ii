package SCI.Iteratius;

import java.util.Scanner;

public class pt9SumesPerMultiplicacio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int multiplicacio = 0;

        for (int i = 0; i < n2; i++) {
            multiplicacio += n1;
        }
        System.out.println(multiplicacio);
    }
}
