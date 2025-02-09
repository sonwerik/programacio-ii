package SCI.Iteratius;

import java.util.Scanner;

public class pt27Scrabble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String paraula = sc.next().toUpperCase();
        int comptador = 0;

        for (int i = 0; i < paraula.length(); i++) {
            char lletra = paraula.charAt(i);

            switch (lletra) {
                case 'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T' -> comptador += 1;
                case 'D', 'G' -> comptador += 2;
                case 'B', 'C', 'M', 'P' -> comptador += 3;
                case 'F', 'H', 'V', 'W', 'Y' -> comptador += 4;
                case 'K' -> comptador += 5;
                case 'J', 'X' -> comptador += 8;
                case 'Q', 'Z' -> comptador += 10;
            }
        }
        System.out.println(comptador);
    }
}