package SCI.Sequencials;

import java.util.Scanner;

public class pt6TempsDeClasseInvertit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt() * 165;

        int h = s / 3600;
        int m = (s % 3600) / 60;
        s = s % 60;

        System.out.println(h);
        System.out.println(m);
        System.out.println(s);
    }
}