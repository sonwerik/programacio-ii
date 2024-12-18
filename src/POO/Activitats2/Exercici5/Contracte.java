package POO.Activitats2.Exercici5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Contracte {
    private final String codi;
    private final LocalDate dataInici;
    private final LocalDate dataFi;
    private final Empresa empresa;

    public Contracte(String codi, LocalDate dataInici, LocalDate dataFi, Empresa empresa) {
        this.codi = codi;
        this.dataInici = dataInici;
        this.dataFi = dataFi;
        this.empresa = empresa;
    }

    public long calcularDurada() {
        return ChronoUnit.DAYS.between(dataInici, dataFi);
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    @Override
    public String toString() {
        return "Contracte{" +
                "codi='" + codi + '\'' +
                ", dataInici=" + dataInici +
                ", dataFi=" + dataFi +
                ", empresa=" + empresa +
                '}';
    }
}