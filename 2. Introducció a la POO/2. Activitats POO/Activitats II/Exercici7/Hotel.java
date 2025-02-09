package POO.Activitats2.Exercici7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Hotel {
    private final String nom;
    private final List<Habitacio> habitacions;
    private final List<Reserva> reserves;

    public Hotel(String nom) {
        this.nom = nom;
        this.habitacions = new ArrayList<>();
        this.reserves = new ArrayList<>();
    }

    public void afegirHabitacio(Habitacio habitacio) {
        if (habitacio == null) {
            throw new IllegalArgumentException("L'habitació no pot ser nul·la.");
        }
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
        if (dataEntrada == null || dataSortida == null || habitacio == null) {
            throw new IllegalArgumentException("Les dades de reserva no poden ser nul·les.");
        }
        boolean reservada = obtenirHabitacionsDisponibles(dataEntrada, dataSortida).contains(habitacio);
        return switch (reservada ? 1 : 0) {
            case 1 -> {
                reserves.add(new Reserva(dataEntrada, dataSortida, habitacio));
                yield true;
            }
            case 0 -> false;
            default -> throw new IllegalStateException("Error inesperat en la reserva.");
        };
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
        if (habitacio == null) {
            System.out.println("L'habitació no existeix.");
        } else {
            System.out.println("Serveis disponibles per a l'habitació: " + habitacio.getServeis());
        }
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