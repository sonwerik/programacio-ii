package POO.Correcccions2.Exercici6;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

class Consultori {
    private String nomDoctor;
    private String especialitat;
    private List<Visita> visites;

    public Consultori(String nomDoctor, String especialitat) {
        this.nomDoctor = nomDoctor;
        this.especialitat = especialitat;
        this.visites = new ArrayList<>();
    }

    public boolean verificarDisponibilitat(LocalDateTime dataHora) {
        return visites.stream().noneMatch(visita -> {
            LocalDateTime inici = visita.getDataHora();
            LocalDateTime fi = inici.plusMinutes(30);
            return !dataHora.isBefore(inici) && !dataHora.isAfter(fi);
        });
    }

    public boolean programarVisita(Visita visita) {
        if (verificarDisponibilitat(visita.getDataHora())) {
            visites.add(visita);
            return true;
        }
        return false;
    }

    public void comptarVisites() {
        System.out.println("Nombre total de visites: " + visites.size());
    }

    public void comptarVisitesEntreDates(LocalDateTime inici, LocalDateTime fi) {
        long comptador = visites.stream().filter(visita ->
                !visita.getDataHora().isBefore(inici) && !visita.getDataHora().isAfter(fi)).count();
        System.out.println("Nombre de visites entre " + inici + " i " + fi + ": " + comptador);
    }

    public void desprogramarVisita(LocalDateTime dataHora) {
        visites.removeIf(visita -> visita.getDataHora().equals(dataHora));
    }

    public void desprogramarTotesVisites() {
        visites.clear();
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