package POO.Correcccions2.Exercici3;

class Camio {
    private String matricula;
    private double pes;

    public Camio(String matricula, double pes) {
        this.matricula = matricula;
        this.pes = pes;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getPes() {
        return pes;
    }

    @Override
    public String toString() {
        return "Camio{" +
                "matricula='" + matricula + '\'' +
                ", pes=" + pes +
                '}';
    }
}