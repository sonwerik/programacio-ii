package POO.Activitats2.Exercici4;

public class Trucada {
    private String destinatari;
    private int minutsTrucada;

    public Trucada() {
        this.destinatari = "";
        this.minutsTrucada = 0;
    }

    public Trucada(String destinatari, int minutsTrucada) {
        this.destinatari = destinatari;
        this.minutsTrucada = minutsTrucada;
    }

    public String getDestinatari() {
        return destinatari;
    }

    public void setDestinatari(String destinatari) {
        this.destinatari = destinatari;
    }

    public int getMinutsTrucada() {
        return minutsTrucada;
    }

    public void setMinutsTrucada(int minutsTrucada) {
        this.minutsTrucada = minutsTrucada;
    }

    @Override
    public String toString() {
        return  "\n    Destinatari: " + destinatari +
                "\n    Duració de la trucada: " + minutsTrucada + "\n";
    }
}
