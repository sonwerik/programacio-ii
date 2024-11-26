package ASM.Hackerrank.String;

import java.util.Scanner;

public class noSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String textNoSpaces = text.replace(" ", "");
        System.out.println(textNoSpaces);
    }
}