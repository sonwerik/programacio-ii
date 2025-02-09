package SCI.Iteratius;

import java.util.Scanner;

public class pt22GraficCoronavirus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int comptadorML = 0;
        int comptadorLL = 0;
        int comptadorNO = 0;
        int comptadorGR = 0;
        int comptadorMG = 0;

        while (true) {
            int dies = sc.nextInt();
            if (dies == -1) break;

            if (dies < 50) comptadorML++;
            else if (dies < 100) comptadorLL++;
            else if (dies < 150) comptadorNO++;
            else if (dies < 200) comptadorGR++;
            else comptadorMG++;
        }

        System.out.println("MG: " + "#".repeat(comptadorMG));
        System.out.println("GR: " + "#".repeat(comptadorGR));
        System.out.println("NO: " + "#".repeat(comptadorNO));
        System.out.println("LL: " + "#".repeat(comptadorLL));
        System.out.println("ML: " + "#".repeat(comptadorML));
    }
}
