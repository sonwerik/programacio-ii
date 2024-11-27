package SCI.Sequencials;

import java.util.Scanner;

public class pt5TempsDeClasse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();

        System.out.println(h * 3600 + m * 60 + s);
    }
}
