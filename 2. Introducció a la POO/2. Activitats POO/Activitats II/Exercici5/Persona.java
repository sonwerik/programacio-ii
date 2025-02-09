package POO.Activitats2.Exercici5;

import java.util.ArrayList;
import java.util.List;

class Persona {
    private final String dni;
    private final String nom;
    private final List<Contracte> contractes;

    public Persona(String dni, String nom) {
        this.dni = dni;
        this.nom = nom;
        this.contractes = new ArrayList<>();
    }

    public void afegirContracte(Contracte contracte) {
        contractes.add(contracte);
    }

    public long calcularDuradaTotalContractes() {
        return contractes.stream().mapToLong(Contracte::calcularDurada).sum();
    }

    public long calcularNombreEmpresesDiferents() {
        return contractes.stream().map(c -> c.getEmpresa().getCif()).distinct().count();
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", nom='" + nom + '\'' +
                ", contractes=" + contractes +
                '}';
    }
}