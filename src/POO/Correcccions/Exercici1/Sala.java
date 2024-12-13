package POO.Correcccions.Exercici1;

class Sala {
    private int numeroDeTelevisions;
    private String tipusSala;

    // Constructor per defecte
    public Sala() {
        this.numeroDeTelevisions = 0;
        this.tipusSala = "desconegut";
    }

    // Getters i Setters
    public int getNumeroDeTelevisions() {
        return numeroDeTelevisions;
    }

    public void setNumeroDeTelevisions(int numeroDeTelevisions) {
        this.numeroDeTelevisions = numeroDeTelevisions;
    }

    public String getTipusSala() {
        return tipusSala;
    }

    public void setTipusSala(String tipusSala) {
        this.tipusSala = tipusSala;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "numeroDeTelevisions=" + numeroDeTelevisions +
                ", tipusSala='" + tipusSala + '\'' +
                '}';
    }
}