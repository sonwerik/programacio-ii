package ASM.Hackerrank.String;

import java.util.Scanner;

public class totesVocals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String vowels = "aeiou";
        String text = sc.nextLine();
        boolean allVowels = true;
        String loweText = text.toLowerCase();

        for (int i = 0; i < vowels.length(); i++) {
            if (!loweText.contains(vowels.charAt(i) + "")) {
                allVowels = false;
                break;
            }
        }
        System.out.println(allVowels);
    }
}

