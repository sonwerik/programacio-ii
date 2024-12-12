package POO.Activitats2.Exercici4;

public class Client {
    private String dni;
    private String nomCognoms;
    private int quantitatTrucades;
    private double preuPerMinut;
    private Trucada trucada;


    public Client() {
        this.dni = "";
        this.nomCognoms = "";
        this.quantitatTrucades = 0;
        this.preuPerMinut = 0.0;
        this.trucada = new Trucada();
    }

    public Client(String dni, String nomCognoms, int quantitatTrucades, double preuPerMinut, Trucada trucada) {
        this.dni = dni;
        this.nomCognoms = nomCognoms;
        this.quantitatTrucades = quantitatTrucades;
        this.trucada = trucada;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNomCognoms() {
        return nomCognoms;
    }

    public void setNomCognoms(String nomCognoms) {
        this.nomCognoms = nomCognoms;
    }

    public Trucada getTrucada() {
        return trucada;
    }

    public void setTrucada(Trucada trucada) {
        this.trucada = trucada;
    }

    public int getQuantitatTrucades() {
        return quantitatTrucades;
    }
    public void setQuantitatTrucades(int quantitatTrucades) {
        this.quantitatTrucades = quantitatTrucades;
    }

    public double getPreuPerMinut() {
        return preuPerMinut;
    }

    public void setPreuPerMinut(double preuPerMinut) {
        this.preuPerMinut = preuPerMinut;
    }

    @Override
    public String toString() {
        return "\n  Nom i Cognoms: " + nomCognoms +
               "\n  DNI: " + dni +
               "\n  Quantitat de trucades: " + quantitatTrucades +
               "\n  Preu per minut: " + preuPerMinut +
               " €\n  Trucades: " + trucada;
    }
}
