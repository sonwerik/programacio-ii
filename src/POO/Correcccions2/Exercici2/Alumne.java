package POO.Correcccions2.Exercici2;

class Alumne {
    private String nom;
    private String cognoms;
    private int edat;
    private String dni;

    public Alumne(String nom, String cognoms, int edat, String dni) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.edat = edat;
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Alumne{" +
                "nom='" + nom + '\'' +
                ", cognoms='" + cognoms + '\'' +
                ", edat=" + edat +
                ", dni='" + dni + '\'' +
                '}';
    }
}