package POO.Activitats2.Solucions.Ex8.Terratremol.terratremol;

import java.time.LocalDate;
import java.util.ArrayList;

public class Terratremol {

    private final Localitzacio localitzacio;
    private final int magnitud;
    private final LocalDate data;
    private final ArrayList<Victima> victimes;

    public Terratremol(Localitzacio localitzacio, int magnitud, LocalDate data, ArrayList<Victima> victimes) {
        this.localitzacio = localitzacio;
        this.magnitud = magnitud;
        this.data = data;
        this.victimes = victimes;
    }

    public Localitzacio getLocalitzacio() {
        return localitzacio;
    }

    public int getMagnitud() {
        return magnitud;
    }

    public ArrayList<Victima> getVictimes() {
        return victimes;
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
