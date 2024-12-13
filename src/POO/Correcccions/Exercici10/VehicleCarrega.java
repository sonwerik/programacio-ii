package POO.Correcccions.Exercici10;

class VehicleCarrega extends Vehicle {
    private double pma; // Pes màxim autoritzat (en tones)

    public VehicleCarrega(String matricula, int diesLloguer, double pma) {
        super(matricula, diesLloguer);
        this.pma = pma;
    }

    @Override
    public double calcularPreu() {
        return calcularPreuBase() + (pma * 20.0);
    }

    @Override
    public String toString() {
        return "VehicleCarrega [matricula=" + getMatricula() + ", diesLloguer=" + getDiesLloguer() + ", pma=" + pma + "]";
    }
}