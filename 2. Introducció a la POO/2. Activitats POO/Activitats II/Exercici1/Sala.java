package POO.Activitats2.Exercici1;

public class Sala {
    private int numeroDeTelevisions;
    private String tipusSala;

    public Sala() {
        this.numeroDeTelevisions = 0;
        this.tipusSala = "desconegut";
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

    @Override
    public String toString() {
        if (numeroDeTelevisions == 1) {
            return tipusSala + " amb " + numeroDeTelevisions + " televisió.";
        } else {
            return tipusSala + " amb " + numeroDeTelevisions + " televisions.";
        }
    }
}