package POO.Correcccions.Exercici3;

import java.util.ArrayList;
import java.util.List;

class Ferri {
    private String matricula;
    private String nom;
    private String portDesti;
    private double preuPerTm;
    private double pesMaxim;
    private List<Camio> camions;

    public Ferri(String matricula, String nom, String portDesti, double preuPerTm, double pesMaxim) {
        this.matricula = matricula;
        this.nom = nom;
        this.portDesti = portDesti;
        this.preuPerTm = preuPerTm;
        this.pesMaxim = pesMaxim;
        this.camions = new ArrayList<>();
    }

    public boolean embarcarCamio(Camio camio) {
        double pesTotal = calcularPesTotal() + camio.getPes();
        if (pesTotal <= pesMaxim) {
            camions.add(camio);
            return true;
        }
        return false;
    }

    public double calcularPesTotal() {
        return camions.stream().mapToDouble(Camio::getPes).sum();
    }

    public boolean estaEmbarcat(String matriculaCamio) {
        return camions.stream().anyMatch(camio -> camio.getMatricula().equals(matriculaCamio));
    }

    public Camio obtenirCamioNEsimaPosicio(int posicio) {
        if (posicio > 0 && posicio <= camions.size()) {
            return camions.get(posicio - 1);
        }
        return null;
    }

    public double calcularPeatgeCamio(String matriculaCamio) {
        for (Camio camio : camions) {
            if (camio.getMatricula().equals(matriculaCamio)) {
                return camio.getPes() * preuPerTm;
            }
        }
        return 0;
    }

    public double calcularPeatgeTotal() {
        return camions.stream().mapToDouble(camio -> camio.getPes() * preuPerTm).sum();
    }

    @Override
    public String toString() {
        return "Ferri{" +
                "matricula='" + matricula + '\'' +
                ", nom='" + nom + '\'' +
                ", portDesti='" + portDesti + '\'' +
                ", preuPerTm=" + preuPerTm +
                ", pesMaxim=" + pesMaxim +
                ", camions=" + camions +
                '}';
    }
}