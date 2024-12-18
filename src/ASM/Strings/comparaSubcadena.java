package ASM.Strings;

import java.util.Scanner;

public class comparaSubcadena {
    public static void main(String[] ignoredArgs) {
        Scanner sc = new Scanner(System.in);

        String text1 = sc.nextLine();
        String text2 = sc.nextLine();
        int count = 0;

        int length = text2.length();

        for (int i = 0; i <= text1.length() - length;  i++) {
            String substring = text1.substring(i, i + length);
            if (substring.equalsIgnoreCase(text2)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
