package POO.Correcccions.Exercici8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Terratremol {
    private Localitzacio localitzacio;
    private double magnitud; // Escala de Richter
    private LocalDate data;
    private List<Victima> victimes;

    public Terratremol(Localitzacio localitzacio, double magnitud, LocalDate data) {
        this.localitzacio = localitzacio;
        this.magnitud = magnitud;
        this.data = data;
        this.victimes = new ArrayList<>();
    }

    public void afegirVictima(Victima victima) {
        victimes.add(victima);
    }

    public List<Victima> getVictimes() {
        return victimes;
    }

    public Localitzacio getLocalitzacio() {
        return localitzacio;
    }

    public double getMagnitud() {
        return magnitud;
    }

    @Override
    public String toString() {
        return "Terratremol{" +
                "localitzacio=" + localitzacio +
                ", magnitud=" + magnitud +
                ", data=" + data +
                ", victimes=" + victimes +
                '}';
    }
}
