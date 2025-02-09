package POO.Activitats2.Exercici1;

public class CasaTest {
    public static void main(String[] args) {
        Casa casaMare = new Casa();
        Casa casaPare = new Casa();

        casaMare.setDireccio("C/ Rocafort 167");
        casaMare.setSuperficie(120);
        casaMare.getSalaCasa().setTipusSala("Menjador");
        casaMare.getSalaCasa().setNumeroDeTelevisions(2);
        casaMare.getCuinaCasa().setNombreDeFogons(6);
        casaMare.getCuinaCasa().setEsIndependet(true);

        casaPare.setDireccio("C/ Gran Via de les Corts Catalanes 859");
        casaPare.setSuperficie(85);
        casaPare.getSalaCasa().setTipusSala("Estudi de música");
        casaPare.getSalaCasa().setNumeroDeTelevisions(1);
        casaPare.getCuinaCasa().setNombreDeFogons(4);
        casaPare.getCuinaCasa().setEsIndependet(false);

        System.out.println("Casa Mare: \n" + casaMare);
        System.out.println();
        System.out.println("Casa Pare: \n" + casaPare);
    }
}
