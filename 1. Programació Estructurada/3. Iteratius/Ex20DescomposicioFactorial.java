package SCI.Iteratius;

import java.util.Scanner;

public class pt20DescomposicioFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int divisor = 2;
        while (n > 1) {
            while (n % divisor == 0) {
                System.out.print(divisor + " ");
                n /= divisor;
            }
            divisor++;
        }
    }
}