package SCI.Iteratius;

import java.util.Scanner;

public class pt10DesnivellCiclista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int desnivell = 0;
        int alturaPorts;

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            alturaPorts = sc.nextInt();
            if (alturaPorts == -1) break;
            desnivell += alturaPorts;
        }
        if (desnivell < 400) System.out.println("ETAPA PLANA");
        else System.out.println("ETAPA MUNTANYA");
    }
}
