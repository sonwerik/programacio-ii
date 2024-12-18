package ASM.Strings;

import java.util.Scanner;

public class esborrarSubcadena {
    public static void main(String[] ignoredArgs) {
        Scanner sc = new Scanner(System.in);

        String text1 = sc.nextLine();
        String text2 = sc.nextLine();
        String result = text1.replaceFirst(text2, "");

        System.out.println(result);
    }
}

