package POO.Activitats2.Exercici9;

import java.util.ArrayList;
import java.util.List;

class EquipEmergencia {
    private final String nom;
    private final String tipus;
    private final List<String> membres;

    public EquipEmergencia(String nom, String tipus) {
        if (nom == null || nom.isEmpty()) {
            throw new IllegalArgumentException("El nom de l'equip no pot estar buit.");
        }
        this.nom = nom;
        this.tipus = tipus != null ? tipus : "Desconegut";
        this.membres = new ArrayList<>();
    }

    public void afegirMembre(String membre) {
        if (membre == null || membre.isEmpty()) {
            System.out.println("El membre no pot ser buit.");
        } else {
            membres.add(membre);
        }
    }

    @Override
    public String toString() {
        return "EquipEmergencia{" +
                "nom='" + nom + '\'' +
                ", tipus='" + tipus + '\'' +
                ", membres=" + membres +
                '}';
    }
}
