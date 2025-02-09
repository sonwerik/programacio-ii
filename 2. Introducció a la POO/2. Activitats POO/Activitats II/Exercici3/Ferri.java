package POO.Activitats2.Exercici3;

public class Ferri {
    private String matriculaFerri;
    private String nomFerri;
    private String portDesti;
    private double preuPerTona;
    private double pesMaximFerri;
    private int camionsEmbarcats;

    public Ferri(String matricula, String nom, String portDesti, double preuPerTona, double pesMaximFerri, int camionsEmbarcats) {
        this.matriculaFerri = matricula;
        this.nomFerri = nom;
        this.portDesti = portDesti;
        this.preuPerTona = preuPerTona;
        this.pesMaximFerri = pesMaximFerri;
        this.camionsEmbarcats = camionsEmbarcats;
    }

    public String getMatriculaFerri() {
        return matriculaFerri;
    }

    public void setMatriculaFerri(String matriculaFerri) {
        this.matriculaFerri = matriculaFerri;
    }

    public String getNomFerri() {
        return nomFerri;
    }

    public void setNomFerri(String nomFerri) {
        this.nomFerri = nomFerri;
    }

    public String getPortDesti() {
        return portDesti;
    }

    public void setPortDesti(String portDesti) {
        this.portDesti = portDesti;
    }

    public double getPreuPerTona() {
        return preuPerTona;
    }

    public void setPreuPerTona(double preuPerTona) {
        this.preuPerTona = preuPerTona;
    }

    public double getPesMaximFerri() {
        return pesMaximFerri;
    }

    public void setPesMaximFerri(double pesMaximFerri) {
        this.pesMaximFerri = pesMaximFerri;
    }

    public int getCamionsEmbarcats() {
        return camionsEmbarcats;
    }

    public void setCamionsEmbarcats(int camionsEmbarcats) {
        this.camionsEmbarcats = camionsEmbarcats;
    }

    @Override
    public String toString() {
        return "\n" + nomFerri +
                ":\n  Matricula: " + matriculaFerri +
                "\n  Destí: " + portDesti +
                "\n  Preu (per Tm): " + preuPerTona +
                "\n  Pes útil màxim: " + pesMaximFerri +
                "\n  Camions embarcats: " + camionsEmbarcats + "\n";
    }
}