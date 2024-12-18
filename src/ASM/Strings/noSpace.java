package ASM.Strings;

import java.util.Scanner;

public class noSpace {
    public static void main(String[] ignoredArgs) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String textNoSpaces = text.replace(" ", "");
        System.out.println(textNoSpaces);
    }
}