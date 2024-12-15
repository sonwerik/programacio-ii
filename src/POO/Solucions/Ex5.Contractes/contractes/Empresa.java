package POO.Solucions.Ex5.Contractes.contractes;

public class Empresa {

    private String cif;
    private String nom;
    private String sectorEmpresarial;

    public Empresa(String cif, String nom, String sectorEmpresarial) {
        this.cif = cif;
        this.nom = nom;
        this.sectorEmpresarial = sectorEmpresarial;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSectorEmpresarial() {
        return sectorEmpresarial;
    }

    public void setSectorEmpresarial(String sectorEmpresarial) {
        this.sectorEmpresarial = sectorEmpresarial;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "cif='" + cif + '\'' +
                ", nom='" + nom + '\'' +
                ", sectorEmpresarial='" + sectorEmpresarial + '\'' +
                '}';
    }
}
