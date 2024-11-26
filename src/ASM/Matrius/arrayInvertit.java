package ASM.Hackerrank.Matrius;

import java.util.Scanner;

public class arrayInvertit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int[][] revertArr = new int[m][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
                revertArr[j][i] = arr[i][j];
            }
        }

        for (int i = 0; i < revertArr.length; i++) {
            for (int j = 0; j < revertArr[i].length; j++) {
                System.out.print(revertArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}