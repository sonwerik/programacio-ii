package POO.Correcccions.Exercici9;

import java.util.ArrayList;
import java.util.List;

class ZonaEvacuacio {
    private String nom;
    private int capacitat;
    private List<String> personesEvacuades;

    public ZonaEvacuacio(String nom, int capacitat) {
        this.nom = nom;
        this.capacitat = capacitat;
        this.personesEvacuades = new ArrayList<>();
    }

    public void afegirPersonaEvacuada(String persona) {
        if (personesEvacuades.size() < capacitat) {
            personesEvacuades.add(persona);
        } else {
            System.out.println("Capacitat màxima assolida a la zona d'evacuació: " + nom);
        }
    }

    @Override
    public String toString() {
        return "ZonaEvacuacio{" +
                "nom='" + nom + '\'' +
                ", capacitat=" + capacitat +
                ", personesEvacuades=" + personesEvacuades +
                '}';
    }
}
