package POO.Correcccions2.Exercici4;

class Trucada {
    private String desti;
    private int duracio; // en minuts

    public Trucada(String desti, int duracio) {
        this.desti = desti;
        this.duracio = duracio;
    }

    public String getDesti() {
        return desti;
    }

    public int getDuracio() {
        return duracio;
    }

    @Override
    public String toString() {
        return "Trucada{" +
                "desti='" + desti + '\'' +
                ", duracio=" + duracio +
                '}';
    }
}