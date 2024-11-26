package SCI.Seqüencials;

import java.util.Scanner;

public class pt5TempsDeClasse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();

        System.out.println(h * 3600 + m * 60 + s);
    }
}
