package SCI.Iteratius;

import java.util.Scanner;

public class pt16Primers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean primer = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) primer = false;
        }
        System.out.println(String.valueOf(primer).toUpperCase());
    }
}