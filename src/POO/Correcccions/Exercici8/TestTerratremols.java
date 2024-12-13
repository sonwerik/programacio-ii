package POO.Correcccions.Exercici8;

import java.time.LocalDate;

public class TestTerratremols {
    public static void main(String[] args) {
        // Localitzacions
        Localitzacio loc1 = new Localitzacio(41.3851, 2.1734, "Barcelona");
        Localitzacio loc2 = new Localitzacio(40.4168, -3.7038, "Madrid");

        // Terratrèmols
        Terratremol terratremol1 = new Terratremol(loc1, 5.8, LocalDate.of(2024, 10, 10));
        Terratremol terratremol2 = new Terratremol(loc2, 6.5, LocalDate.of(2024, 11, 15));

        // Victimes
        Victima victima1 = new Victima("Anna López", 30, "Ferida");
        Victima victima2 = new Victima("Marc Torres", 45, "Desapareguda");
        Victima victima3 = new Victima("Laura Garcia", 60, "Morta");

        // Afegir víctimes als terratrèmols
        terratremol1.afegirVictima(victima1);
        terratremol1.afegirVictima(victima2);
        terratremol2.afegirVictima(victima3);

        // Mostrar dades dels terratrèmols
        System.out.println("Dades del primer terratrèmol:");
        System.out.println(terratremol1);
        System.out.println("\nDades del segon terratrèmol:");
        System.out.println(terratremol2);

        // Mostrar víctimes d'un terratrèmol concret
        System.out.println("\nVíctimes del primer terratrèmol:");
        System.out.println(terratremol1.getVictimes());

        // Mostrar localització i magnitud del primer terratrèmol
        System.out.println("\nLocalització i magnitud del primer terratrèmol:");
        System.out.println(terratremol1.getLocalitzacio());
        System.out.println("Magnitud: " + terratremol1.getMagnitud());
    }
}