package POO.Activitats1.Exercici2;

public class PermisConduir {
    private String name;
    private String tipuPermis;
    private int punts;

    public void setName(String name) {this.name = name;}
    public void setTipuPermis(String tipusPermis) {this.tipuPermis = tipusPermis;}
    public void setPunts(int punts) {this.punts = punts;}

    public void restaPunts(int puntsARestar) {
        punts -= puntsARestar;
    }

    public void imprimirPermis() {
        System.out.println(name + ": "+ tipuPermis + " (" + punts + " Punts)");
    }
}