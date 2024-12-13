package POO.Correcccions.Exercici10;

class Microbus extends Cotxe {
    public Microbus(String matricula, int diesLloguer, int places) {
        super(matricula, diesLloguer, places);
    }

    @Override
    public double calcularPreu() {
        return super.calcularPreu() + (getDiesLloguer() * 2.0);
    }

    @Override
    public String toString() {
        return "Microbus [matricula=" + getMatricula() + ", diesLloguer=" + getDiesLloguer() + "]";
    }
}