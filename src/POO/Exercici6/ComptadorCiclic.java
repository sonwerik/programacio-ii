package POO.Exercici6;

public class ComptadorCiclic {
    private int comptador;

    public ComptadorCiclic() {
        this.comptador = 0;
    }

    public int consultar() {
        return this.comptador;
    }

    public void incrementar() {
        if (this.comptador < 9) {comptador++;}
        else {comptador = 0;}
    }

    public void reset() {
        this.comptador = 0;
    }
}