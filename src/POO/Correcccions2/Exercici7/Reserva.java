package POO.Correcccions2.Exercici7;

import java.time.LocalDate;

class Reserva {
    private LocalDate dataEntrada;
    private LocalDate dataSortida;
    private Habitacio habitacio;

    public Reserva(LocalDate dataEntrada, LocalDate dataSortida, Habitacio habitacio) {
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