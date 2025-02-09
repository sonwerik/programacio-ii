package POO.Activitats2.Exercici4;

public class Trucada {
    private String destinatari;
    private int duracio;

    public Trucada(String destinatari, int duracio) {
        this.destinatari = destinatari;
        this.duracio = duracio;
    }

    public int getDuracio() {
        return duracio;
    }

    public void setDuracio(int duracio) {
        this.duracio = duracio;
    }

    public String getDestinatari() {
        return destinatari;
    }

    public void setDestinatari(String destinatari) {
        this.destinatari = destinatari;
    }

    @Override
    public String toString() {
        return "Trucada:" +
                "\n    Destinatari: " + destinatari +
                "\n    Duracio: " + duracio + " minuts";
    }
}