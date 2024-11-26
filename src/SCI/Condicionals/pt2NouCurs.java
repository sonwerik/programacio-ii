package SCI.Condicionals;

import java.util.Scanner;

public class pt2NouCurs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int p = sc.nextInt();
        int m = sc.nextInt();

        if (n > 0 && a > 0 && p> 0 && m > 0){
            if (n * a * p > m){
                System.out.println("A l'institut hi caben tots els alumnes, encara n'hi caben " + (n * a * p - m));
            }else {
                System.out.println("Calen " + ((n * a * p - m) * -1) + " places per tots els alumnes que s'han matriculat");
            }
        } else {
            System.out.println("Error dades introduides no valides");
        }
    }
}