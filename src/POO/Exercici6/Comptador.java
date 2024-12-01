package POO.Exercici6;

public class Comptador {
    private int digit;

    public Comptador() {
        this.digit = 0;
    }

    public int consultar() {
        return this.digit;
    }
    public void incrementar() {
        if (this.digit < 9) {
            digit++;
        } else {
            digit = 0;}
    }
    public void reset() {
        this.digit = 0;
    }
}