package POO.Correcccions2.Exercici7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Hotel {
    private String nom;
    private List<Habitacio> habitacions;
    private List<Reserva> reserves;

    public Hotel(String nom) {
        this.nom = nom;
        this.habitacions = new ArrayList<>();
        this.reserves = new ArrayList<>();
    }

    public void afegirHabitacio(Habitacio habitacio) {
        habitacions.add(habitacio);
    }

    public List<Habitacio> obtenirHabitacionsDisponibles(LocalDate dataInici, LocalDate dataFi) {
        List<Habitacio> disponibles = new ArrayList<>(habitacions);
        for (Reserva reserva : reserves) {
            if (!(dataFi.isBefore(reserva.getDataEntrada()) || dataInici.isAfter(reserva.getDataSortida()))) {
                disponibles.remove(reserva.getHabitacio());
            }
        }
        return disponibles;
    }

    public boolean reservarHabitacio(LocalDate dataEntrada, LocalDate dataSortida, Habitacio habitacio) {
        if (obtenirHabitacionsDisponibles(dataEntrada, dataSortida).contains(habitacio)) {
            reserves.add(new Reserva(dataEntrada, dataSortida, habitacio));
            return true;
        }
        return false;
    }

    public boolean estaReservada(LocalDate data, Habitacio habitacio) {
        for (Reserva reserva : reserves) {
            if (reserva.getHabitacio().equals(habitacio)
                    && !data.isBefore(reserva.getDataEntrada()) && !data.isAfter(reserva.getDataSortida())) {
                return true;
            }
        }
        return false;
    }

    public void mostrarServeisHabitacio(Habitacio habitacio) {
        System.out.println("Serveis disponibles per a l'habitació: " + habitacio.getServeis());
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "nom='" + nom + '\'' +
                ", habitacions=" + habitacions +
                ", reserves=" + reserves +
                '}';
    }
}

