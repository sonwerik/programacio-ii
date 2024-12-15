package POO.Solucions.Ex1.Casa;

// Classe Sala
public class Sala {
    private int numeroDeTelevisions;
    private String tipusSala;

    // Constructor amb valors per defecte
    public Sala() {
        this.numeroDeTelevisions = 0;
        this.tipusSala = "desconegut";
    }

    // Constructor amb paràmetres opcionals
    public Sala(int numeroDeTelevisions, String tipusSala) {
        this.numeroDeTelevisions = numeroDeTelevisions;
        this.tipusSala = tipusSala;
    }

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

    // Mètode toString per mostrar la informació de la sala
    @Override
    public String toString() {
        return "Sala{" +
                "numeroDeTelevisions=" + numeroDeTelevisions +
                ", tipusSala='" + tipusSala + '\'' +
                '}';
    }

}

