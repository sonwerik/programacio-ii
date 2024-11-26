package SCI.Iteratius;

import java.util.Scanner;

public class pt21AparicioDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        int X = sc.nextInt();

        int comptador = 0;

        while (N > 0) {
            if (N % 10 == X) {
                comptador++;
            }
            N /= 10;
        }

        System.out.println(comptador);
    }
}