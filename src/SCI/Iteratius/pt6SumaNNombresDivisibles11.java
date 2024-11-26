package SCI.Iteratius;

import java.util.Scanner;

public class pt6SumaNNombresDivisibles11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int suma = 0;

        for (int i = 0; i < n; i++) {
            int operador = sc.nextInt();
            if (operador % 11 == 0) suma += operador;
        }
        System.out.println(suma);
    }
}
