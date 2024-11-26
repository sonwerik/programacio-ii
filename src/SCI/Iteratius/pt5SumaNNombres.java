package SCI.Iteratius;

import java.util.Scanner;

public class pt5SumaNNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int suma = 0;

        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            suma += x;
        }
        System.out.println(suma);
    }
}