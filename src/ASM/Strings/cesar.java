package ASM.Hackerrank.String;

import java.util.Scanner;

public class cesar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        int num = sc.nextInt();
        StringBuilder code = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            if (Character.isLetter(currentChar)) {
                char lowerChar = Character.toLowerCase(currentChar);
                int newIndex = (lowerChar - 'a' + num) % 26;
                char newChar = (char) (newIndex + 'a');

                if (Character.isUpperCase(currentChar)) {
                    newChar = Character.toUpperCase(newChar);
                }
                code.append(newChar);
            }
            else {
                code.append(currentChar);
            }
        }

        System.out.println(code);
    }
}
