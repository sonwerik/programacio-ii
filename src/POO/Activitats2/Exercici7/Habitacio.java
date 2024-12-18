package POO.Activitats2.Exercici7;

import java.util.ArrayList;
import java.util.List;

class Habitacio {
    private final String tipusHabitacio;
    private final List<Servei> serveis;

    public Habitacio(String tipusHabitacio) {
        this.tipusHabitacio = tipusHabitacio;
        this.serveis = new ArrayList<>();
    }

    public void afegirServei(Servei servei) {
        serveis.add(servei);
    }

    public List<Servei> getServeis() {
        return serveis;
    }

    @Override
    public String toString() {
        return "Habitacio{" +
                "tipusHabitacio='" + tipusHabitacio + '\'' +
                ", serveis=" + serveis +
                '}';
    }
}