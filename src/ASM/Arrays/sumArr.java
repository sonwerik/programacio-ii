package ASM.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class sumArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] num1 = new int[n1];

        for (int i = 0; i < n1; i++) {
            num1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] num2 = new int[n2];

        for (int i = 0; i < n2; i++) {
            num2[i] = sc.nextInt();
        }

        int[] combined = new int[n1 + n2];

        for (int i = 0; i < n1; i++) {
            combined[i] = num1[i];
        }

        for (int i = 0; i < n2; i++) {
            combined[i + n1] = num2[i];
        }

        // System.arraycopy(num1, 0, combined, 0, n1);
        // System.arraycopy(num2, 0, combined, n1, n2);

        Arrays.sort(combined);

        for (int i = 0; i < combined.length ;i++) {
            System.out.print((combined[i] + " "));
        }

/*
        for (int j : combined) {
            System.out.print((j + " "));
        }
 */
    }
}