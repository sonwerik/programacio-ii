package POO.Activitats2.Solucions.Ex4.Telefonia.telefonia;

import java.util.ArrayList;
import java.util.Objects;

public class Client {
    private String dni;
    private String nom;
    private final double preuXMinut;
    ArrayList<Trucada>trucades;

    public Client(String dni, String nom, double preuXMinut) {
        this.dni = dni;
        this.nom = nom;
        this.preuXMinut = preuXMinut;
        trucades = new ArrayList<>();
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

    public void afegirTrucada(Trucada trucada){
        trucades.add(trucada);
    }

    public int totalMinuts(){
        int totalminuts = 0;
        for(Trucada trucada : trucades){
            totalminuts += trucada.getDuracio();
        }
        return totalminuts;
    }

    public double preuTrucada(Trucada t){

        return (double) Math.round(t.getDuracio() * preuXMinut * 100) /100;
    }
    public double totalPreu(){

        return (double) Math.round(totalMinuts() * preuXMinut * 100) /100;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(dni, client.dni);
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder("---- Info Client ----\n" +
                "Dni=" + dni + " \n" +
                "Nom='" + nom + " \n" +
                "PreuXMinut=" + preuXMinut +
                "\n-------------------\n" +
                "--- Info Trucades ---\n");

        for (Trucada trucada: trucades)
            info.append(trucada).append(" PreuTrucada= ").append(preuTrucada(trucada)).append("\n");

        info.append("-------------------");

        return info.toString();
    }
}