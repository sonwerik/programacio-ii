package POO.Correcccions2.Exercici4;

import java.util.ArrayList;
import java.util.List;

class Client {
    private String dni;
    private String nom;
    private double preuPerMinut;
    private List<Trucada> trucades;

    public Client(String dni, String nom, double preuPerMinut) {
        this.dni = dni;
        this.nom = nom;
        this.preuPerMinut = preuPerMinut;
        this.trucades = new ArrayList<>();
    }

    public String getDni() {
        return dni;
    }

    public double getPreuPerMinut() {
        return preuPerMinut;
    }

    public List<Trucada> getTrucades() {
        return trucades;
    }

    public void afegirTrucada(Trucada trucada) {
        trucades.add(trucada);
    }

    public double calcularTotalFactura() {
        return trucades.stream().mapToDouble(t -> t.getDuracio() * preuPerMinut).sum();
    }

    public int calcularTotalMinuts() {
        return trucades.stream().mapToInt(Trucada::getDuracio).sum();
    }

    @Override
    public String toString() {
        return "Client{" +
                "dni='" + dni + '\'' +
                ", nom='" + nom + '\'' +
                ", preuPerMinut=" + preuPerMinut +
                ", trucades=" + trucades +
                '}';
    }
}