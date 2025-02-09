package POO.Activitats2.Solucions.Ex5.Contractes.contractes;

import java.util.ArrayList;

public class Persona {
private String dni;
private String nom;
private final ArrayList<Contracte> contractes;


    public Persona(String dni, String nom) {
        this.dni = dni;
        this.nom = nom;
        this.contractes = new ArrayList<>();
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

    public ArrayList<Contracte> getContractes() {
        return contractes;
    }

    public void afegeixContracte(Contracte contracte){
        this.contractes.add(contracte);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", nom='" + nom + '\'' +
                ", contractes=" + contractes +
                '}';
    }
}
