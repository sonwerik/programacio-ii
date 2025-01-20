package ASM.Arrays;

import java.util.Scanner;

public class ex6ArrayRepetit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] party = new int[n];
        int[] empty = new int[20];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < party.length; i++) {
            party[i] = sc.nextInt();
            for (int j = 0; j <= empty.length; j++) {
                if (party[i] == j + 1) {
                    empty[j]++;
                }
            }
        }

        for (int i : empty) {
            if (i > max) {
                max = i;
            }
        }

        for (int i = 1; i < 20; i++) {
            if (empty[i -1] == max) {
                System.out.println(i);
            }
        }
    }
}