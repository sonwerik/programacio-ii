package POO.Activitats1.Exercici2;

public class ImprimirPermis {
    public static void main(String[] args) {

        PermisConduir permis1 = new PermisConduir();
        PermisConduir permis2 = new PermisConduir();
        PermisConduir permis3 = new PermisConduir();
        PermisConduir permis4 = new PermisConduir();

        permis1.setName("Nicolas Bondia");
        permis1.setTipuPermis("B");
        permis1.setPunts(8);

        permis2.setName("Yolanda Huertas");
        permis2.setTipuPermis("B");
        permis2.setPunts(12);

        permis3.setName("Oriol Guimó");
        permis3.setTipuPermis("A2");
        permis3.setPunts(15);

        permis4.setName("Pau Queralt");
        permis4.setTipuPermis("B");
        permis4.setPunts(14);

        System.out.println("\nPERMISOS DE CONDUIR ABANS DE COMETRE INFRACCIONS:");
        permis1.imprimirPermis();
        permis2.imprimirPermis();
        permis3.imprimirPermis();
        permis4.imprimirPermis();

        permis1.restaPunts(3);
        permis2.restaPunts(4);
        permis3.restaPunts(4);
        permis4.restaPunts(6);

        System.out.println("\nPERMISOS DE CONDUIR DESPRÉS DE COMETRE INFRACCIONS:");
        permis1.imprimirPermis();
        permis2.imprimirPermis();
        permis3.imprimirPermis();
        permis4.imprimirPermis();
    }
}