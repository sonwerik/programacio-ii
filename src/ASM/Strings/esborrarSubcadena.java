package ASM.Hackerrank.String;

import java.util.Scanner;

public class esborrarSubcadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text1 = sc.nextLine();
        String text2 = sc.nextLine();
        String result = text1.replaceFirst(text2, "");

        System.out.println(result);
    }
}

