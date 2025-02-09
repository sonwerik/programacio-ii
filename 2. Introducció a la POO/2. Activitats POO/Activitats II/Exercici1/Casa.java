package POO.Activitats2.Exercici1;

public class Casa {
    private double superficie;
    private String direccio;
    private Sala salaCasa;
    private Cuina cuinaCasa;

    public Casa() {
        superficie = 0.0;
        direccio = "";
        salaCasa = new Sala();
        cuinaCasa = new Cuina();
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

    @Override
    public String toString() {
        return " Superficie: " + superficie + " m2\n Direccio: " + direccio
                + "\n Sala: " + salaCasa + "\n Cuina: " + cuinaCasa;
    }
}
