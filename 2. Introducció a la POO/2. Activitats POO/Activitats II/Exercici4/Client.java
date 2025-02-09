package POO.Activitats2.Exercici4;

import java.util.ArrayList;

public class Client {
    private String dni;
    private String nom;
    private double preuPerMinut;
    private ArrayList<Trucada> trucades;

    public Client() {
        this.dni = "";
        this.nom = "";
        this.preuPerMinut = 0.0;
        this.trucades = new ArrayList<>();
    }

    public Client(String dni, String nom, double preuPerMinut) {
        this.dni = dni;
        this.nom = nom;
        this.preuPerMinut = preuPerMinut;
        this.trucades = new ArrayList<>();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPreuPerMinut() {
        return preuPerMinut;
    }

    public void setPreuPerMinut(double preuPerMinut) {
        this.preuPerMinut = preuPerMinut;
    }

    public ArrayList<Trucada> getTrucades() {
        return trucades;
    }

    public void setTrucades(ArrayList<Trucada> trucades) {
        this.trucades = trucades;
    }

    public void afegirTrucada(String destinatari, int durada) {
        Trucada trucada = new Trucada(destinatari, durada);
        trucades.add(trucada);
    }

    public double calcularFactura() {
        double total = 0;
        for (Trucada trucada : trucades) {
            total += trucada.getDuracio() * preuPerMinut;
        }
        return total;
    }

    public void mostrarTrucades() {
        for (Trucada trucada : trucades) {
            System.out.println(trucada);
        }
    }

    public int minutsTotals() {
        int totalMinuts = 0;
        for (Trucada trucada : trucades) {
            totalMinuts += trucada.getDuracio();
        }
        return totalMinuts;
    }

    @Override
    public String toString() {
        return "Factura" + nom +
                "\n  DNI: " + dni +
                "\n  Preu: " + preuPerMinut + " €" +
                "\n  Trucades: " + trucades +
                "\n  Minuts: " + minutsTotals() +
                "\n  Total: " + calcularFactura();
    }
}