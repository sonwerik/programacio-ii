package ASM.Hackerrank.Arrays;

import java.util.Scanner;

public class missatgeReduit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String upperText = text.toUpperCase();

        for (String i : upperText.split(" ")) {
            System.out.print(i.charAt(0) + "" + i.charAt(i.length() - 1) + " ");
        }
    }
}
