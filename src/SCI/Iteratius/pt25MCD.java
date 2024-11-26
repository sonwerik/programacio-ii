package SCI.Iteratius;

import java.util.Scanner;

public class pt25MCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        while (m != 0) {
            int temp = m;
            m = n % m;
            n = temp;
        }
        System.out.println(n);
    }
}