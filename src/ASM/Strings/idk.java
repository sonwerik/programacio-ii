package ASM.Hackerrank.String;

import java.util.Scanner;

public class idk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u') {
                System.out.println("vowel");
            } else {
                System.out.println("consonant");
            }
        }
    }
}
