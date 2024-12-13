package POO.Correcccions2.Exercici9;

import java.util.ArrayList;
import java.util.List;

class Inundacio {
    private double profunditatAigua; // En metres
    private String data;
    private List<ZonaEvacuacio> zonesEvacuacio;
    private List<EquipEmergencia> equipsEmergencia;

    public Inundacio(double profunditatAigua, String data) {
        this.profunditatAigua = profunditatAigua;
        this.data = data;
        this.zonesEvacuacio = new ArrayList<>();
        this.equipsEmergencia = new ArrayList<>();
    }

    public void afegirZonaEvacuacio(ZonaEvacuacio zona) {
        zonesEvacuacio.add(zona);
    }

    public void afegirEquipEmergencia(EquipEmergencia equip) {
        equipsEmergencia.add(equip);
    }

    public boolean generarAlerta(double llindar) {
        return profunditatAigua > llindar;
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
