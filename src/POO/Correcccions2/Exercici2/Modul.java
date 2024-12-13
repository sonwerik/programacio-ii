package POO.Correcccions2.Exercici2;

class Modul {
    private String nom;

    public Modul(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Modul{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
