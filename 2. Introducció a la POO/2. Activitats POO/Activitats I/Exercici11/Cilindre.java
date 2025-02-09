package POO.Activitats1.Exercici11;

import POO.Activitats1.Exercici10.Cercle;

public class Cilindre {
    private final Cercle base;
    private final double altura;

    public Cilindre(double radi, double altura) {
        this.base = new Cercle(radi);
        this.altura = altura;
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