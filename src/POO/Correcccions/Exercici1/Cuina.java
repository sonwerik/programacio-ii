package POO.Correcccions.Exercici1;

class Cuina {
    private boolean esIndependent;
    private int nombreDeFogons;

    // Constructor per defecte
    public Cuina() {
        this.esIndependent = false;
        this.nombreDeFogons = 0;
    }

    // Getters i Setters
    public boolean isEsIndependent() {
        return esIndependent;
    }

    public void setEsIndependent(boolean esIndependent) {
        this.esIndependent = esIndependent;
    }

    public int getNombreDeFogons() {
        return nombreDeFogons;
    }

    public void setNombreDeFogons(int nombreDeFogons) {
        this.nombreDeFogons = nombreDeFogons;
    }

    @Override
    public String toString() {
        return "Cuina{" +
                "esIndependent=" + esIndependent +
                ", nombreDeFogons=" + nombreDeFogons +
                '}';
    }
}