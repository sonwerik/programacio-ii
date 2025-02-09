package SCI.Iteratius;

import java.util.Scanner;

public class pt30MaxMinGrafic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numAnterior = sc.nextInt();
        int numActual = sc.nextInt();
        int numMax = 0;
        int numMin = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (true) {
            int numSeguent = sc.nextInt();
            if (numSeguent == -1) break;

            if (numActual < numAnterior && numActual < numSeguent) {
                numMin++;
                if (numActual < min) {
                    min = numActual;
                }
            }

            if (numActual > numAnterior && numActual > numSeguent) {
                numMax++;
                if (numActual > max) {
                    max = numActual;
                }
            }

            numAnterior = numActual;
            numActual = numSeguent;
        }

        System.out.println(numMin);
        System.out.println(numMax);
        System.out.println(min);
        System.out.println(max);
    }
}