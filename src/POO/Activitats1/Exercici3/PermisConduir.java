package POO.Activitats1.Exercici3;

public class PermisConduir {
    private String nom;
    private String tipuPermis;
    private int punts;

    public void setNom(String nom) {this.nom = nom;}
    public void setTipuPermis(String tipusPermis) {this.tipuPermis = tipusPermis;}
    public void setPunts(int punts) {this.punts = punts;}


    public void imprimirPermis() {
        System.out.println("Nom del tiutlar: "+ nom);
        System.out.println("Tipus de permís de conduir: " + tipuPermis);
        System.out.println("Quantitat de punts: " + punts);
    }
}