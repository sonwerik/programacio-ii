package POO.Solucions.Ex5.Contractes.contractes;

import java.util.Date;

public class Contracte {

    private String codi;
    private Date iniciContracte;
    private Date fiContracte;
    private Empresa empresa;

    public Contracte(String codi, Date iniciContracte, Date fiContracte, Empresa empresa) {
        this.codi = codi;
        this.iniciContracte = iniciContracte;
        this.fiContracte = fiContracte;
        this.empresa = empresa;
    }

    public String getCodi() {
        return codi;
    }

    public void setCodi(String codi) {
        this.codi = codi;
    }

    public Date getIniciContracte() {
        return iniciContracte;
    }

    public void setIniciContracte(Date iniciContracte) {
        this.iniciContracte = iniciContracte;
    }

    public Date getFiContracte() {
        return fiContracte;
    }

    public void setFiContracte(Date fiContracte) {
        this.fiContracte = fiContracte;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
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
