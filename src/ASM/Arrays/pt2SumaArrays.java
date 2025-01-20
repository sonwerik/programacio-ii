package ASM.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class pt2SumaArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        Arrays.fill(arr2, arr1[n - 1]);

        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + arr2[i] + " ");
        }
    }
}
