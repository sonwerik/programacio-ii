package POO.Exercici6;

public class Comptador {
    private int digit;
    private int limit;

    public Comptador(int limit) {
        this.digit = 0;
        this.limit = limit;
    }

    public int consultar() {
        return this.digit;
    }
    public void incrementar() {
        if (this.digit < this.limit) {
            this.digit++;
        } else {
            this.digit = 0;}
    }
    public void reset() {
        this.digit = 0;
    }
}