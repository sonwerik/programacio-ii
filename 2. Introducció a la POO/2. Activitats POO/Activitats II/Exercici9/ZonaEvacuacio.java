package POO.Activitats2.Exercici9;

import java.util.ArrayList;
import java.util.List;

class ZonaEvacuacio {
    private final String nom;
    private final int capacitat;
    private final List<String> personesEvacuades;

    public ZonaEvacuacio(String nom, int capacitat) {
        if (capacitat <= 0) {
            throw new IllegalArgumentException("La capacitat ha de ser major que 0.");
        }
        this.nom = nom != null ? nom : "Desconeguda";
        this.capacitat = capacitat;
        this.personesEvacuades = new ArrayList<>();
    }

    public void afegirPersonaEvacuada(String persona) {
        if (persona == null || persona.isEmpty()) {
            System.out.println("El nom de la persona no pot ser buit.");
            return;
        }
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
