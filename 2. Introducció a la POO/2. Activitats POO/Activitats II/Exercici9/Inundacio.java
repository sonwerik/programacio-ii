package POO.Activitats2.Exercici9;

import java.util.ArrayList;
import java.util.List;

class Inundacio {
    private final double profunditatAigua;
    private final String data;
    private final List<ZonaEvacuacio> zonesEvacuacio;
    private final List<EquipEmergencia> equipsEmergencia;

    public Inundacio(double profunditatAigua, String data) {
        if (profunditatAigua < 0) {
            throw new IllegalArgumentException("La profunditat de l'aigua no pot ser negativa.");
        }
        this.profunditatAigua = profunditatAigua;
        this.data = data != null ? data : "Desconeguda";
        this.zonesEvacuacio = new ArrayList<>();
        this.equipsEmergencia = new ArrayList<>();
    }

    public void afegirZonaEvacuacio(ZonaEvacuacio zona) {
        if (zona == null) {
            System.out.println("La zona d'evacuació no pot ser nul·la.");
        } else {
            zonesEvacuacio.add(zona);
        }
    }

    public void afegirEquipEmergencia(EquipEmergencia equip) {
        if (equip == null) {
            System.out.println("L'equip d'emergència no pot ser nul.");
        } else {
            equipsEmergencia.add(equip);
        }
    }

    public boolean generarAlerta(double llindar) {
        return switch ((int) Math.signum(profunditatAigua - llindar)) {
            case 1 -> true;
            case 0, -1 -> false;
            default -> throw new IllegalStateException("Error inesperat en el càlcul d'alerta.");
        };
    }

    @Override
    public String toString() {
        return "Inundacio{" +
                "profunditatAigua=" + profunditatAigua +
                ", data='" + data + '\'' +
                ", zonesEvacuacio=" + zonesEvacuacio +
                ", equipsEmergencia=" + equipsEmergencia +
                '}';
    }
}
