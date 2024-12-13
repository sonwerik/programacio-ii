package POO.Correcccions2.Exercici10;

class Cotxe extends Vehicle {
    private int places;

    public Cotxe(String matricula, int diesLloguer, int places) {
        super(matricula, diesLloguer);
        this.places = places;
    }

    @Override
    public double calcularPreu() {
        return calcularPreuBase() + (getDiesLloguer() * places * 1.5);
    }

    @Override
    public String toString() {
        return "Cotxe [matricula=" + getMatricula() + ", diesLloguer=" + getDiesLloguer() + ", places=" + places + "]";
    }
}
