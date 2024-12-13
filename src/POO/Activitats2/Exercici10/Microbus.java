package POO.Activitats2.Exercici10;

class Microbus extends Cotxe {
    public Microbus(String matricula, int diesLloguer, int places) {
        super(matricula, diesLloguer, places);
    }

    @Override
    public double calcularPreu() {
        double preu = super.calcularPreu() + (getDiesLloguer() * 2.0);
        return Math.max(preu, 0); // Garantir que el preu no sigui negatiu
    }

    @Override
    public String toString() {
        return "Microbus [matricula=" + getMatricula() + ", diesLloguer=" + getDiesLloguer() + "]";
    }
}
