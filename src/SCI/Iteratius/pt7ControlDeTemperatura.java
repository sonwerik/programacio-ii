package SCI.Iteratius;

import java.util.Scanner;

public class pt7ControlDeTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= numero; i++) {
            int temperatura = sc.nextInt();
            if (temperatura > max) max = temperatura;
            if (temperatura < min) min = temperatura;
        }
        System.out.println(max);
        System.out.println(min);
    }
}
