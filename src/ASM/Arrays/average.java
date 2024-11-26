package ASM.Arrays;

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] nom = new String[n];
        float[] nota = new float[n];

        float total = 0;

        for (int i = 0; i < n; i++) {
            nom[i] = sc.next();
            nota[i] = sc.nextFloat();
            total += nota[i];
        }

        float mitjana = total / n;

        for (int i = 0; i < n; i++) {
            if (nota[i] >= mitjana){
                System.out.println(nom[i]);
            }
        }
    }
}
