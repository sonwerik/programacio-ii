package ASM.Matrius;

import java.util.Scanner;

public class invertir {
    public static void main(String[] ignoredArgs) {
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

        for (int[] ints : revertArr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}