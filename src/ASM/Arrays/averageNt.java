package ASM.Arrays;

import java.util.Scanner;

public class averageNt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] nom = new String[n];
        float[] nota = new float[n];

        float maxNota1 = Float.MIN_VALUE;
        String maxNom1 = "";
        float maxNota2 = Float.MIN_VALUE;
        String maxNom2 = "";

        for (int i = 0; i < n; i++) {
            nom[i] = sc.next();
            nota[i] = sc.nextFloat();
            if (nota[i] > maxNota1){
                maxNota1 = nota[i];
                maxNom1 = nom[i];
            }
            if (nota[i] < maxNota1 && nota[i] > maxNota2){
                maxNota2 = nota[i];
                maxNom2 = nom[i];
            }
        }
        System.out.println(maxNom1);
        System.out.println(maxNom2);
    }
}