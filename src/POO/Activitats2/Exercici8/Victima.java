package POO.Activitats2.Exercici8;

class Victima {
    private String nom;
    private int edat;
    private String estat;

    public Victima(String nom, int edat, String estat) {
        if (edat < 0) {
            throw new IllegalArgumentException("L'edat no pot ser negativa.");
        }
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