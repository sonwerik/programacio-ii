package SCI.Iteratius;

import java.util.Scanner;

public class pt24Consecutius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int anterior = sc.nextInt();
        boolean consecutiu = false;

        while (true) {
            int actual = sc.nextInt();
            if (actual == 0) break;
            if (actual == anterior) consecutiu = true;
            anterior = actual;
        }
        System.out.println(String.valueOf(consecutiu).toUpperCase());
    }
}
