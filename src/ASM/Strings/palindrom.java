package ASM.Strings;

import java.util.Scanner;

public class palindrom {
    public static void main(String[] ignoredArgs) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String lowerText = text.toLowerCase();
        String justText = lowerText.replaceAll("[^a-z]", "");
        String reverse = new StringBuilder(justText).reverse().toString();
        boolean isPalindrome = justText.equals(reverse);
        if (isPalindrome) {
            System.out.println("TRUE");
        }
        else {
            System.out.println("FALSE");
        }
    }
}
