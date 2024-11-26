package ASM.Arrays;

import java.util.Scanner;

public class teams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] name = new String[n];
        int[] score = new int[n];

        for (int i = 0; i < n; i++) {
            name[i] = sc.next();
            score[i] = sc.nextInt();
        }

        int sortScore;
        String sortName;
        boolean sorted;

        for (int i = 0; i < n - 1; i++) {
            sorted = false;
            for (int j = 0; j < n - 1; j++) {
                if (score[j] < score[j + 1]) {
                    sortScore = score[j];
                    sortName = name[j];
                    score[j] = score[j + 1];
                    name[j] = name[j + 1];
                    score[j + 1] = sortScore;
                    name[j + 1] = String.valueOf(sortName);
                    sorted = true;
                }
            }
            if (!sorted) {
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(name[i] + " " + score[i]);
        }
    }
}
