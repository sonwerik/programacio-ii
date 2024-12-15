package POO.Solucions.Ex8.Terratremol.terratremol;

import java.time.LocalDate;
import java.util.ArrayList;

public class Terratremol {

    private Localitzacio localitzacio;
    private int magnitud;
    private LocalDate data;
    private ArrayList<Victima> victimes;

    public Terratremol(Localitzacio localitzacio, int magnitud, LocalDate data, ArrayList<Victima> victimes) {
        this.localitzacio = localitzacio;
        this.magnitud = magnitud;
        this.data = data;
        this.victimes = victimes;
    }

    public Localitzacio getLocalitzacio() {
        return localitzacio;
    }

    public void setLocalitzacio(Localitzacio localitzacio) {
        this.localitzacio = localitzacio;
    }

    public int getMagnitud() {
        return magnitud;
    }

    public void setMagnitud(int magnitud) {
        this.magnitud = magnitud;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public ArrayList<Victima> getVictimes() {
        return victimes;
    }

    public void setVictimes(ArrayList<Victima> victimes) {
        this.victimes = victimes;
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
