package POO.Activitats2.Exercici8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Terratremol {
    private final Localitzacio localitzacio;
    private final double magnitud; // Escala de Richter
    private final LocalDate data;
    private final List<Victima> victimes;

    public Terratremol(Localitzacio localitzacio, double magnitud, LocalDate data) {
        if (magnitud < 0 || magnitud > 10) {
            throw new IllegalArgumentException("La magnitud ha de ser entre 0 i 10.");
        }
        this.localitzacio = localitzacio;
        this.magnitud = magnitud;
        this.data = data;
        this.victimes = new ArrayList<>();
    }

    public void afegirVictima(Victima victima) {
        switch (victima.toString()) {
            case "Morta":
            case "Ferida":
            case "Desapareguda":
                victimes.add(victima);
                break;
            default:
                System.out.println("Estat de la víctima no reconegut: " + victima);
        }
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