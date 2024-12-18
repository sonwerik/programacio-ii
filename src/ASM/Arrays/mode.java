package ASM.Arrays;

import java.util.Scanner;

public class mode {
    public static void main(String[] ignoredArgs) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] partits = new int[n];
        int mode = 0;
        int maxCount = 0;

        for (int i = 0; i < n; i++) {
            partits[i] = sc.nextInt();

            int count = 0;

            for (int j = 0; j < n; j++) {
                if (partits[j] == partits[i]) count++;
            }

            if (count > maxCount) {
                maxCount = count;
                mode = partits[i];
            }
        }
        System.out.println( mode);
    }
}
