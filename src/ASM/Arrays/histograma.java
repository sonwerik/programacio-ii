package ASM.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class histograma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.print(arr[0] + " ");
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i+1]) {
                System.out.print("-");
            } else {
                System.out.print("-");
                System.out.println();
                System.out.print(arr[i+1] + " ");
            }
        }
        System.out.print("-");
    }
}