package POO.Activitats2.Exercici6;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

class Consultori {
    private final String nomDoctor;
    private final String especialitat;
    private final List<Visita> visites;

    public Consultori(String nomDoctor, String especialitat) {
        this.nomDoctor = nomDoctor;
        this.especialitat = especialitat;
        this.visites = new ArrayList<>();
    }

    public boolean verificarDisponibilitat(LocalDateTime dataHora) {
        for (Visita visita : visites) {
            LocalDateTime inici = visita.getDataHora();
            LocalDateTime fi = inici.plusMinutes(30);
            if (!dataHora.isBefore(inici) && !dataHora.isAfter(fi)) {
                return false;
            }
        }
        return true;
    }

    public boolean programarVisita(Visita visita) {
        boolean disponible = verificarDisponibilitat(visita.getDataHora());
        return switch (disponible ? 1 : 0) {
            case 1 -> {
                visites.add(visita);
                yield true;
            }
            case 0 -> false;
            default -> throw new IllegalStateException("Unexpected value: " + disponible);
        };
    }

    public void comptarVisites() {
        int totalVisites = visites.size();
        if (totalVisites == 0) {
            System.out.println("No hi ha visites programades.");
        } else {
            System.out.println("Nombre total de visites: " + totalVisites);
        }
    }

    public void comptarVisitesEntreDates(LocalDateTime inici, LocalDateTime fi) {
        long comptador = 0;
        for (Visita visita : visites) {
            if (!visita.getDataHora().isBefore(inici) && !visita.getDataHora().isAfter(fi)) {
                comptador++;
            }
        }
        if ((int) comptador == 0) {
            System.out.println("No hi ha visites entre " + inici + " i " + fi + ".");
        } else {
            System.out.println("Nombre de visites entre " + inici + " i " + fi + ": " + comptador);
        }
    }

    public void desprogramarVisita(LocalDateTime dataHora) {
        boolean visitaEliminada = false;
        for (int i = 0; i < visites.size(); i++) {
            if (visites.get(i).getDataHora().equals(dataHora)) {
                visites.remove(i);
                visitaEliminada = true;
                break;
            }
        }
        switch (visitaEliminada ? 1 : 0) {
            case 1:
                System.out.println("Visita desprogramada amb èxit.");
                break;
            case 0:
                System.out.println("No s'ha trobat cap visita a l'hora indicada.");
                break;
        }
    }

    public void desprogramarTotesVisites() {
        visites.clear();
        System.out.println("Totes les visites han estat desprogramades.");
    }

    @Override
    public String toString() {
        return "Consultori{" +
                "nomDoctor='" + nomDoctor + '\'' +
                ", especialitat='" + especialitat + '\'' +
                ", visites=" + visites +
                '}';
    }
}