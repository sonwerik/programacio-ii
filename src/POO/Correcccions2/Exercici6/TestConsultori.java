package POO.Correcccions2.Exercici6;

import java.time.LocalDateTime;

public class TestConsultori {
    public static void main(String[] args) {
        Consultori consultori = new Consultori("Dr. Joan Garcia", "Cardiologia");

        // Programar visites
        Visita visita1 = new Visita(LocalDateTime.of(2024, 12, 15, 10, 0), "Anna López");
        Visita visita2 = new Visita(LocalDateTime.of(2024, 12, 15, 10, 30), "Marc Pérez");
        Visita visita3 = new Visita(LocalDateTime.of(2024, 12, 15, 11, 0), "Laura Torres");

        System.out.println("Visita 1 programada: " + consultori.programarVisita(visita1));
        System.out.println("Visita 2 programada: " + consultori.programarVisita(visita2));
        System.out.println("Visita 3 programada: " + consultori.programarVisita(visita3));

        // Intentar programar una visita que solapa
        Visita visita4 = new Visita(LocalDateTime.of(2024, 12, 15, 10, 15), "Josep Garcia");
        System.out.println("Visita 4 programada: " + consultori.programarVisita(visita4));

        // Comptar visites
        consultori.comptarVisites();

        // Comptar visites entre dues dates
        consultori.comptarVisitesEntreDates(LocalDateTime.of(2024, 12, 15, 9, 0),
                LocalDateTime.of(2024, 12, 15, 12, 0));

        // Desprogramar una visita
        consultori.desprogramarVisita(LocalDateTime.of(2024, 12, 15, 10, 30));
        System.out.println("Després de desprogramar una visita:");
        consultori.comptarVisites();

        // Desprogramar totes les visites
        consultori.desprogramarTotesVisites();
        System.out.println("Després de desprogramar totes les visites:");
        consultori.comptarVisites();
    }
}