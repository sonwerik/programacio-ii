package SCI.Iteratius;

import java.util.Scanner;

public class pt2CopiesAutomatiques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String frase = sc.nextLine();
        int copies = sc.nextInt();

        for (int i = 0; i < copies; i++) {
            System.out.println(frase);
        }
    }
}
