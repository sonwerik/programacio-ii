package POO.Activitats2.Exercici1;

public class Cuina {
    private boolean esIndependet;
    private int nombreDeFogons;

    public Cuina() {
        esIndependet = false;
        nombreDeFogons = 0;
    }

    public int getNombreDeFogons() {
        return nombreDeFogons;
    }
    public void setNombreDeFogons(int nombreDeFogons) {
        this.nombreDeFogons = nombreDeFogons;
    }
    public boolean isEsIndependet() {
        return esIndependet;
    }
    public void setEsIndependet(boolean esIndependet) {
        this.esIndependet = esIndependet;
    }

    @Override
    public String toString() {
        if (esIndependet) {
            return "Cuina independent amb " + nombreDeFogons + " fogons.";
        } else {
            return "Cuina americana amb " + nombreDeFogons + " fogons.";
        }
    }
}

