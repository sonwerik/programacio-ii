package POO.Activitats1.Exercici12;

public class Anell {
    private final String model;
    private final double diametreDit;
    private final double diametreSeccio;

    public Anell(String model, double diametreDit, double diametreSeccio) {
        this.model = model;
        this.diametreDit = diametreDit;
        this.diametreSeccio = diametreSeccio;
    }

    public double getRadiDit() {
        return diametreDit / 2;
    }

    public double getRadiSeccio() {
        return diametreSeccio / 2;
    }

    public double getVolum() {
        double R = getRadiDit() / 10.0;
        double r = getRadiSeccio() / 10.0;
        return 2 * Math.PI * Math.PI * R * r * r;
    }

    public double getPes() {
        double DENSITAT_OR = 19.3;
        return getVolum() * DENSITAT_OR;
    }

    public double getCostOr() {
        double PREU_OR_GRAM = 10.0;
        return getPes() * PREU_OR_GRAM;
    }

    public double getCostTotal() {
        double COST_BASE = 40.0;
        return COST_BASE + getCostOr();
    }

    public double getPreuVenda() {
        double MARGE_BENEFICI = 2.1;
        return getCostTotal() * (1 + MARGE_BENEFICI);
    }

    @Override
    public String toString() {
        return "\nAnell " + model + ":\nDiàmetre dit: " + diametreDit + " mm\nDiàmetre secció: " + diametreSeccio +
                " mm\nPes: " + getPes() + " g\nCost Or: " + getCostOr() +
                " €\nPreu venda; " + getPreuVenda() + " €";
    }
}