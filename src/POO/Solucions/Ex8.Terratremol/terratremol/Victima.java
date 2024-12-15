package POO.Solucions.Ex8.Terratremol.terratremol;

public class Victima {

    private String nom;
    private int edat;
    private String estat;

    public Victima(String nom, int edat, String estat) {
        this.nom = nom;
        this.edat = edat;
        this.estat = estat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public String getEstat() {
        return estat;
    }

    public void setEstat(String estat) {
        this.estat = estat;
    }

    @Override
    public String toString() {
        return "Victima{" +
                "nom='" + nom + '\'' +
                ", edat=" + edat +
                ", estat='" + estat + '\'' +
                '}';
    }
}
