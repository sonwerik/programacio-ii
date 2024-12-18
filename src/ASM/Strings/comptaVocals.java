package ASM.Strings;
import java.util.Scanner;

public class comptaVocals {
    public static void main(String[] ignoredArgs) {
        Scanner sc = new Scanner(System.in);

        String vocals = "aeiouAEIOU";
        String[] text = new String[] {sc.nextLine()};
        int count = 0;

        for (int i = 0; i < text[0].length(); i++) {
            if (vocals.contains(text[0].charAt(i)+"")) {
                count++;
            }
        }
        System.out.println(count);
    }
}