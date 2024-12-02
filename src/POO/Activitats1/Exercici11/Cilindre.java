package POO.Activitats1.Exercici11;

import POO.Activitats1.Exercici10.Cercle;

public class Cilindre {
    private final Cercle BASE;
    private final double ALTURA;

    public Cilindre(double radi, double altura) {
        this.BASE = new Cercle(radi);
        this.ALTURA = altura;
    }

    public double getAreaTotal() {
        return 2 * BASE.getArea() + BASE.getPerimetre() * ALTURA;
    }

    public double getVolum() {
        return BASE.getArea() * ALTURA;
    }

    public boolean esMesGranQue(Cilindre altre) {
        return this.getVolum() > altre.getVolum();
    }

    @Override
    public String toString() {
        return "Cilindre: \nRadi = " + BASE.getRadi() + "\nAltura = " + ALTURA +
                "\nÀrea Total = " + getAreaTotal() + "\nVolum = " + getVolum() + "\n";
    }
}