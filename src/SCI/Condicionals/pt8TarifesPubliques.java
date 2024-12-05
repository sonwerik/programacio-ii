package SCI.Condicionals;

import java.util.Scanner;

public class pt8TarifesPubliques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edat = sc.nextInt();
        int viatges = sc.nextInt();

        if (edat > 0){
            if (edat <= 3) {
            System.out.println("Transport gratuit");
            } else if (edat <= 16) {
                System.out.println("T-16");
            } else if (edat <= 25 && viatges > 10) {
                System.out.println("T-jove");
            } else if (edat <= 25 && viatges > 5) {
                System.out.println("T-casual");
            } else if (edat <= 25 && viatges > 0) {
                System.out.println("Bitllet senzill");
            } else if (edat > 25 && edat < 60 && viatges > 10) {
                System.out.println("T-usual");
            } else if (edat > 25 && edat < 60 && viatges > 5) {
                System.out.println("T-casual");
            } else if (edat > 25 && edat < 60 && viatges > 0) {
                System.out.println("Bitllet senzill");
            } else if (edat >= 60) {
                System.out.println("Targeta Rosa");
            }
        }
    }
}
