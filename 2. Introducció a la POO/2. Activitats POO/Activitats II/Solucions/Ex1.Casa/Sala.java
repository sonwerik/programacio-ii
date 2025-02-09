package POO.Activitats2.Solucions.Ex1.Casa;

// Classe Sala
public class Sala {
    private final int numeroDeTelevisions;
    private final String tipusSala;

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

    // Mètode toString per mostrar la informació de la sala
    @Override
    public String toString() {
        return "Sala{" +
                "numeroDeTelevisions=" + numeroDeTelevisions +
                ", tipusSala='" + tipusSala + '\'' +
                '}';
    }

}

