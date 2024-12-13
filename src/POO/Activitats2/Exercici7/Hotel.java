package POO.Activitats2.Exercici7;

import java.time.LocalDate;
import java.util.ArrayList;

public class Hotel {
    private String nom;
    private ArrayList<Habitacio> habitacions;
    private ArrayList<Reserva> reserves;

    public Hotel() {
        habitacions = new ArrayList<>();
        reserves = new ArrayList<>();
    }

    public void ferReserva(LocalDate dataInici, LocalDate dataFi, int habitacio) {

    }

    public ArrayList<Habitacio> habitaciosDisponibles() {
        ArrayList<Habitacio> disponible = new ArrayList<>();

        // filtrar

        return disponible;
    }

    public void mostraServei(int numHabitacions) {

        // for habitacions, cerca numHabitacions, if found print
    }
    /*
    public boolean isDisponible(LocalDate dataInici, LocalDate dataFi, int habitacio) {
        boolean disponible = false;

        ArrayList<Habitacio> habitacionsDisponibles = habitacionsDisponibles(dataInici, dataFi);

        return disponible;
    }

    public boolean isDisponible(LocalDate data, int habitacio) {
        boolean disponible = false;

        ArrayList<Habitacio> habitacionsDisponibles = habitacionsDisponibles(data, data + 1);

        // comprova si habitacio esta en la llista

        return disponible;
    }
    */
}