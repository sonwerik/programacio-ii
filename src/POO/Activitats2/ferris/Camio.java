package POO.Activitats2.ferris;

public class Camio {
    private String matriculaCamio;
    private double pesCamio;
    private int numCamio;

    public Camio() {
        this.matriculaCamio = "";
        this.pesCamio = 0.0;
        this.numCamio = 0;
    }

    public Camio(String matricula, double pes, int numCamio) {
        this.matriculaCamio = matricula;
        this.pesCamio = pes;
        this.numCamio = numCamio;
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

    @Override
    public String toString() {
        return "\nCamió " + numCamio +
                "\n  Matricula: " + matriculaCamio +
                "\n  Pes: " + pesCamio + "\n";
    }
}
