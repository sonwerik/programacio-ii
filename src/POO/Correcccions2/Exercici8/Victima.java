package POO.Correcccions2.Exercici8;

class Victima {
    private String nom;
    private int edat;
    private String estat; // Desapareguda, Ferida, Morta

    public Victima(String nom, int edat, String estat) {
        this.nom = nom;
        this.edat = edat;
        this.estat = estat;
    }

    @Override
    public String toString() {
        return "Victima{" +
                "nom='" + nom + '\'' +
                ", edat=" + edat +
                ", estat='" + estat + '\'' +
                '}';
    }
}