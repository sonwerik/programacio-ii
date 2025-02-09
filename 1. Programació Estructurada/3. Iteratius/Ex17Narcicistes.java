package SCI.Iteratius;

import java.util.Scanner;

public class pt17Narcicistes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int n1 = n / 100;
        int n2 = (n % 100) / 10;
        int n3 = n % 10;

        int pown1 = 1;
        int pown2 = 1;
        int pown3 = 1;

        boolean narcicista = false;
        if (n >= 100 && n < 1000){
            for (int i = 1; i <= 3; i++) {
                pown1 *= n1;
            }
            for (int i = 1; i <= 3; i++) {
                pown2 *= n2;
            }
            for (int i = 1; i <= 3; i++) {
                pown3 *= n3;
            }
            if (pown1 + pown2 + pown3 == n) narcicista = true;
            System.out.println(String.valueOf(narcicista).toUpperCase());
        }
    }
}
