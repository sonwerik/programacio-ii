package POO.Solucions.Ex1.Casa;

// Classe Casa
public class Casa {
    private double superficie;
    private String direccio;
    private Sala salaCasa;
    private Cuina cuinaCasa;

    // Constructor amb valors per defecte
    public Casa() {
        this.superficie = 100.0; // Exemple de valor per defecte
        this.direccio = "desconeguda";
        this.salaCasa = new Sala();
        this.cuinaCasa = new Cuina();
    }

    // Constructor amb paràmetres opcionals per sala i cuina
    public Casa(double superficie, String direccio, Sala salaCasa, Cuina cuinaCasa) {
        this.superficie = superficie;
        this.direccio = direccio;
        this.salaCasa = salaCasa;
        this.cuinaCasa = cuinaCasa;

    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public String getDireccio() {
        return direccio;
    }

    public void setDireccio(String direccio) {
        this.direccio = direccio;
    }

    public Sala getSalaCasa() {
        return salaCasa;
    }

    public void setSalaCasa(Sala salaCasa) {
        this.salaCasa = salaCasa;
    }

    public Cuina getCuinaCasa() {
        return cuinaCasa;
    }

    public void setCuinaCasa(Cuina cuinaCasa) {
        this.cuinaCasa = cuinaCasa;
    }

    // Mètode toString per mostrar la informació de la casa
    @Override
    public String toString() {
        return "Casa{" +
                "superficie=" + superficie +
                ", direccio='" + direccio + '\'' +
                ", salaCasa=" + salaCasa +
                ", cuinaCasa=" + cuinaCasa +
                '}';
    }

}
