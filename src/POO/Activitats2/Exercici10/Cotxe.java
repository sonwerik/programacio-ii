package POO.Activitats2.Exercici10;

class Cotxe extends Vehicle {
    private int places;

    public Cotxe(String matricula, int diesLloguer, int places) {
        super(matricula, diesLloguer);
        if (places <= 0) {
            throw new IllegalArgumentException("El nombre de places ha de ser major que zero.");
        }
        this.places = places;
    }

    @Override
    public double calcularPreu() {
        double preu = calcularPreuBase() + (getDiesLloguer() * places * 1.5);
        switch ((int) Math.signum(preu)) {
            case 1:
                return preu;
            default:
                throw new IllegalStateException("Error inesperat en el càlcul del preu.");
        }
    }

    @Override
    public String toString() {
        return "Cotxe [matricula=" + getMatricula() + ", diesLloguer=" + getDiesLloguer() + ", places=" + places + "]";
    }
}
