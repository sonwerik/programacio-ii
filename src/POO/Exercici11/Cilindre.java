package POO.Exercici11;

import POO.Exercici10.Cercle;

public class Cilindre {
    private Cercle base;
    private double altura;

    public Cilindre(double radi, double altura) {
        this.base = new Cercle(radi);
        this.altura = altura;
    }

    public double getRadi() {
        return base.getRadi();
    }

    public void setRadi(double radi) {
        base.setRadi(radi);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAreaBase() {
        return base.getArea();
    }

    public double getAreaTotal() {
        return 2 * base.getArea() + base.getPerimetre() * altura;
    }

    public double getVolum() {
        return base.getArea() * altura;
    }

    public boolean esMesGranQue(Cilindre altre) {
        return this.getVolum() > altre.getVolum();
    }

    @Override
    public String toString() {
        return "Cilindre: \nRadi = " + base.getRadi() + "\nAltura = " + altura +
                "\nÀrea Total = " + getAreaTotal() + "\nVolum = " + getVolum() + "\n";
    }
}