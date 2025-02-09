package POO.Activitats1.Exercici10;

public class Cercle {
    private double radi;

    public Cercle(double radi) {
        this.radi = radi;
    }

    public double getRadi() {
        return radi;
    }

    public void setRadi(double radi) {
        this.radi = radi;
    }

    public double getPerimetre() {
        return 2 * Math.PI * radi;
    }

    public double getArea() {
        return Math.PI * radi * radi;
    }

    public boolean esMesGranQue(Cercle altre) {
        return this.getArea() > altre.getArea();
    }

    @Override
    public String toString() {
        return "Cercle: \nRadi = " + radi + "\nPerímetre = " + getPerimetre() + "\nÀrea = " + getArea() + "\n";
    }
}