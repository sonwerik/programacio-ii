package POO.Activitats2.Solucions.Ex1.Casa;

// Classe Casa
public class Casa {
    private final double superficie;
    private final String direccio;
    private final Sala salaCasa;
    private final Cuina cuinaCasa;

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
