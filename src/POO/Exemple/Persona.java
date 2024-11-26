package POO.Exemple;

public class Persona {

    private String nom;
    private int edat;

    public String getNom(){
        return nom;
    }

    public int getEdat(){
        return edat;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public void setEdat(int edatNova){
        edat = edatNova;
    }

    public void saluda() {
        System.out.println("Hola, sóc " + nom + " i tinc " + edat + " anys");
    }
}
