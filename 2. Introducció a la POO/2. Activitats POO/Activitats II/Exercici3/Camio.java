package POO.Activitats2.Exercici3;

public class Camio {
    private String matriculaCamio;
    private double pesCamio;
    private int numCamio;
    private boolean embarcat;

    public Camio(String matricula, double pes, int numCamio, boolean embarcat) {
        this.matriculaCamio = matricula;
        this.pesCamio = pes;
        this.numCamio = numCamio;
        this.embarcat = false;
    }

    public String getMatriculaCamio() {
        return matriculaCamio;
    }

    public void setMatriculaCamio(String matriculaCamio) {
        this.matriculaCamio = matriculaCamio;
    }

    public double getPesCamio() {
        return pesCamio;
    }
    public void setPesCamio(double pesCamio) {
        this.pesCamio = pesCamio;
    }

    public int getNumCamio() {
        return numCamio;
    }

    public void setNumCamio(int numCamio) {
        this.numCamio = numCamio;
    }

    public boolean isEmbarcat() {
        return embarcat;
    }

    public void setEmbarcat(boolean embarcat) {
        this.embarcat = embarcat;
    }

    @Override
    public String toString() {
        return "\nCamió " + numCamio +
                "\n  Matricula: " + matriculaCamio +
                "\n  Pes: " + pesCamio + "\n";
    }
}