package POO.Correcccions.Exercici1;

class Casa {
    private double superficie;
    private String direccio;
    private Sala salaCasa;
    private Cuina cuinaCasa;

    // Constructor per defecte
    public Casa() {
        this.superficie = 0.0;
        this.direccio = "desconegut";
        this.salaCasa = new Sala();
        this.cuinaCasa = new Cuina();
    }

    // Getters i Setters
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