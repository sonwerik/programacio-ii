package POO.Correcccions.Exercici7;

import java.util.ArrayList;
import java.util.List;

class Habitacio {
    private String tipusHabitacio; // Simple, doble, suite
    private List<Servei> serveis;

    public Habitacio(String tipusHabitacio) {
        this.tipusHabitacio = tipusHabitacio;
        this.serveis = new ArrayList<>();
    }

    public void afegirServei(Servei servei) {
        serveis.add(servei);
    }

    public String getTipusHabitacio() {
        return tipusHabitacio;
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
