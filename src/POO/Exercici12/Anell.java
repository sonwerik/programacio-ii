package POO.Exercici12;

public class Anell {
    private String model;
    private double diàmetreDit;
    private double diàmetreSecció;
    private final double DENSITAT_OR = 19.3;
    private final double PREU_OR_GRAM = 10.0;
    private final double COST_BASE = 40.0;
    private final double MARGE_BENEFICI = 2.1;

    public Anell(String model, double diàmetreDit, double diàmetreSecció) {
        this.model = model;
        this.diàmetreDit = diàmetreDit;
        this.diàmetreSecció = diàmetreSecció;
    }

    public double getRadiDit() {
        return diàmetreDit / 2;
    }

    public double getRadiSecció() {
        return diàmetreSecció / 2;
    }

    public double getVolum() {
        double R = getRadiDit() / 10.0;
        double r = getRadiSecció() / 10.0;
        return 2 * Math.PI * Math.PI * R * r * r;
    }

    public double getPes() {
        return getVolum() * DENSITAT_OR;
    }

    public double getCostOr() {
        return getPes() * PREU_OR_GRAM;
    }

    public double getCostTotal() {
        return COST_BASE + getCostOr();
    }

    public double getPreuVenda() {
        return getCostTotal() * (1 + MARGE_BENEFICI);
    }

    @Override
    public String toString() {
        return "Anell Model: " + model + ", Diàmetre Dit = " + diàmetreDit + " mm, Diàmetre Secció = " + diàmetreSecció +
                " mm, Pes = " + getPes() + " g, Cost Or = €" + getCostOr() +
                ", Preu Venda = €" + getPreuVenda();
    }
}