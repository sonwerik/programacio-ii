package Exercici2;

public class ImprimirPermis {
    public static void main(String[] args) {

        String nomPropietari1 = "Nicolas Bondia";
        String tipusPermis1 = "B";
        int puntsPermis1 = 8;

        String nomPropietari2 = "Yolanda Huertas";
        String tipusPermis2 = "B";
        int puntsPermis2 = 12;

        String nomPropietari3 = "Oriol Guimó";
        String tipusPermis3 = "A2";
        int puntsPermis3 = 15;

        String nomPropietari4 = "Pau Queralt";
        String tipusPermis4 = "B";
        int puntsPermis4 = 14;

        PermisConduir permis1 = new PermisConduir();
        PermisConduir permis2 = new PermisConduir();
        PermisConduir permis3 = new PermisConduir();
        PermisConduir permis4 = new PermisConduir();

        permis1.setName(nomPropietari1);
        permis1.setTipuPermis(tipusPermis1);
        permis1.setPunts(puntsPermis1);

        permis2.setName(nomPropietari2);
        permis2.setTipuPermis(tipusPermis2);
        permis2.setPunts(puntsPermis2);

        permis3.setName(nomPropietari3);
        permis3.setTipuPermis(tipusPermis3);
        permis3.setPunts(puntsPermis3);

        permis4.setName(nomPropietari4);
        permis4.setTipuPermis(tipusPermis4);
        permis4.setPunts(puntsPermis4);

        System.out.println("\n" + permis1.getName() + ": "+ permis1.getTipuPermis() + " (" + permis1.getPunts() + " Punts)");
        System.out.println(permis2.getName() + ": "+ permis2.getTipuPermis() + " (" + permis2.getPunts() + " Punts)");
        System.out.println(permis3.getName() + ": "+ permis3.getTipuPermis() + " (" + permis3.getPunts() + " Punts)");
        System.out.println(permis4.getName() + ": "+ permis4.getTipuPermis() + " (" + permis4.getPunts() + " Punts)");
    }
}