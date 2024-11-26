package ASM.Hackerrank.String;

import java.util.Scanner;

public class dni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dni = sc.nextInt();
        String letters = "TRWAGMYFPDXBNJZSQVHLCKE";
        int letter = dni % 23;
        char nif = letters.charAt(letter);
        System.out.print(dni);
        System.out.print(nif);
    }
}
