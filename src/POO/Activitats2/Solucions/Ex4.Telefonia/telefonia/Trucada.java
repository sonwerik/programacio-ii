package POO.Activitats2.Solucions.Ex4.Telefonia.telefonia;

public class Trucada {
    private final String desti;
    private final int duracio;

    public Trucada(String desti, int duracio) {
        this.desti = desti;
        this.duracio = duracio;
    }

    public int getDuracio() {
        return duracio;
    }

    @Override
    public String toString() {
        return "Duracio= " + duracio + "  Desti= "+ desti;
    }
}
