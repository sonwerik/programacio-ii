package SCI.Condicionals;

import java.util.Scanner;

public class pt10DiesMes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mes = sc.nextInt();
        int any = sc.nextInt();
        int anyTraspas = any % 4;

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            System.out.println("31");
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            System.out.println("30");
        } else if (mes == 2) {
            if  (anyTraspas == 0) {
                System.out.println(29);
            } else {
                System.out.println(28);
            }
        } else {
            System.out.println("Error de dades");
        }
    }
}
