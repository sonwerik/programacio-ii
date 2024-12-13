package POO.Correcccions.Exercici9;

import java.util.ArrayList;
import java.util.List;

class EquipEmergencia {
    private String nom;
    private String tipus; // Rescat, Assistència Mèdica, etc.
    private List<String> membres;

    public EquipEmergencia(String nom, String tipus) {
        this.nom = nom;
        this.tipus = tipus;
        this.membres = new ArrayList<>();
    }

    public void afegirMembre(String membre) {
        membres.add(membre);
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