package POO.Activitats2.Exercici10;

abstract class Vehicle {
    private String matricula;
    private int diesLloguer;

    public Vehicle(String matricula, int diesLloguer) {
        if (matricula == null || matricula.isEmpty()) {
            throw new IllegalArgumentException("La matrícula no pot ser nul·la o buida.");
        }
        if (diesLloguer <= 0) {
            throw new IllegalArgumentException("Els dies de lloguer han de ser majors que zero.");
        }
        this.matricula = matricula;
        this.diesLloguer = diesLloguer;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getDiesLloguer() {
        return diesLloguer;
    }

    public double calcularPreuBase() {
        return diesLloguer * 10.0; // Preu base: 10 € per dia
    }

    public abstract double calcularPreu();

    @Override
    public String toString() {
        return "Vehicle [matricula=" + matricula + ", diesLloguer=" + diesLloguer + "]";
    }
}