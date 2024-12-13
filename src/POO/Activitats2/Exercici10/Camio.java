package POO.Activitats2.Exercici10;

class Camio extends VehicleCarrega {
    public Camio(String matricula, int diesLloguer, double pma) {
        super(matricula, diesLloguer, pma);
    }

    @Override
    public double calcularPreu() {
        return super.calcularPreu() + 40.0; // Suma fixa de 40 €
    }

    @Override
    public String toString() {
        return "Camio [matricula=" + getMatricula() + ", diesLloguer=" + getDiesLloguer() + "]";
    }
}
