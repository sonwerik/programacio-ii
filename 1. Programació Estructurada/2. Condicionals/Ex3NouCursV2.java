package SCI.Condicionals;

import java.util.Scanner;

public class pt3NouCursV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alumnes = sc.nextInt();
        int aules = sc.nextInt();
        int plantes = sc.nextInt();
        int matricules = sc.nextInt();

        int placesLliures = alumnes * aules * plantes - matricules;
        int placesSobrants = (alumnes * aules * plantes - matricules) * -1;
        double plantesFaltants = Math.ceil((double) placesSobrants / aules / alumnes);
        int plantesLliures = placesLliures / aules / alumnes;

        if (alumnes > 0 && aules > 0 && plantes > 0 && matricules > 0){
            if (alumnes * aules * plantes > matricules){
                System.out.println("A l'institut sobren " + plantesLliures + " plantes");
            }else {
                System.out.println("Calen " + (int) plantesFaltants + " plantes per acollir tots els alumnes matriculats");
            }
        } else {
            System.out.println("Error dades introduides no valides");
        }
    }
}
