package POO.Activitats2.Solucions.Ex5.Contractes.contractes;

public class Empresa {

    private final String cif;
    private String nom;
    private final String sectorEmpresarial;

    public Empresa(String cif, String nom, String sectorEmpresarial) {
        this.cif = cif;
        this.nom = nom;
        this.sectorEmpresarial = sectorEmpresarial;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
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
