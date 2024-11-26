package POO.Exercici4;

public class Alumne {
    private String nom;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void saluda() {
        System.out.println("Hola! Sóc en " + nom);
    }
}