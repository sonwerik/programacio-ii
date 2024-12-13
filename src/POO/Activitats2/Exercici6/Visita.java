package POO.Activitats2.Exercici6;

import java.time.LocalDateTime;

class Visita {
    private LocalDateTime dataHora;
    private String pacient;

    public Visita(LocalDateTime dataHora, String pacient) {
        this.dataHora = dataHora;
        this.pacient = pacient;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public String getPacient() {
        return pacient;
    }

    @Override
    public String toString() {
        return "Visita{" +
                "dataHora=" + dataHora +
                ", pacient='" + pacient + '\'' +
                '}';
    }
}