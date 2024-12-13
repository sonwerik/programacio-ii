package POO.Correcccions.Exercici5;

class Empresa {
    private String cif;
    private String nom;
    private String sector;

    public Empresa(String cif, String nom, String sector) {
        this.cif = cif;
        this.nom = nom;
        this.sector = sector;
    }

    public String getCif() {
        return cif;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "cif='" + cif + '\'' +
                ", nom='" + nom + '\'' +
                ", sector='" + sector + '\'' +
                '}';
    }
}