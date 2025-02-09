package POO.Activitats2.Solucions.Ex5.Contractes.contractes;

import java.util.Date;

public class Contracte {

    private final String codi;
    private final Date iniciContracte;
    private final Date fiContracte;
    private final Empresa empresa;

    public Contracte(String codi, Date iniciContracte, Date fiContracte, Empresa empresa) {
        this.codi = codi;
        this.iniciContracte = iniciContracte;
        this.fiContracte = fiContracte;
        this.empresa = empresa;
    }

    public Date getIniciContracte() {
        return iniciContracte;
    }

    public Date getFiContracte() {
        return fiContracte;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    @Override
    public String toString() {
        return "Contracte{" +
                "codi='" + codi + '\'' +
                ", iniciContracte=" + iniciContracte +
                ", fiContracte=" + fiContracte +
                ", empresa=" + empresa +
                '}';
    }
}
