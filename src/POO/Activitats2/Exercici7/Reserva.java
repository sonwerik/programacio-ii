package POO.Activitats2.Exercici7;

import java.time.LocalDate;

class Reserva {
    private final LocalDate dataEntrada;
    private final LocalDate dataSortida;
    private final Habitacio habitacio;

    public Reserva(LocalDate dataEntrada, LocalDate dataSortida, Habitacio habitacio) {
        if (dataEntrada.isAfter(dataSortida)) {
            throw new IllegalArgumentException("La data d'entrada no pot ser posterior a la data de sortida.");
        }
        this.dataEntrada = dataEntrada;
        this.dataSortida = dataSortida;
        this.habitacio = habitacio;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public LocalDate getDataSortida() {
        return dataSortida;
    }

    public Habitacio getHabitacio() {
        return habitacio;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "dataEntrada=" + dataEntrada +
                ", dataSortida=" + dataSortida +
                ", habitacio=" + habitacio +
                '}';
    }
}