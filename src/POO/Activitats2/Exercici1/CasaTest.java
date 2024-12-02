package POO.Activitats2.Exercici1;

public class CasaTest {
    public static void main(String[] args) {
        Casa casaMare = new Casa();
        Casa casaPare = new Casa();

        casaMare.setDireccio("C/ Rocafort 167");
        casaMare.setSuperficie(120);
        casaMare.getSalaCasa().setTipusSala("Habitacio Èrik");
        casaMare.getSalaCasa().setTipusSala("Habitacio Mare");
        casaMare.getSalaCasa().setTipusSala("Sala d'estudi");
        casaMare.getSalaCasa().setTipusSala("Sala de masatges");
        casaMare.getSalaCasa().setTipusSala("Sala d'estar");
        casaMare.getSalaCasa().setNumeroDeTelevisions(1);
        casaMare.getCuinaCasa().setNombreDeFogons(6);
        casaMare.getCuinaCasa().setEsIndependet(true);

        casaPare.setDireccio("C/ Gran Via de les Corts Catalanes 859");
        casaPare.setSuperficie(85);
        casaPare.getSalaCasa().setTipusSala("Habitacio Èrik");
        casaPare.getSalaCasa().setTipusSala("Habitacio Pare");
        casaPare.getSalaCasa().setTipusSala("Habitacio de convidats");
        casaPare.getSalaCasa().setTipusSala("Estudi de música");
        casaPare.getSalaCasa().setTipusSala("Sala d'estar");
        casaPare.getSalaCasa().setNumeroDeTelevisions(2);
        casaPare.getCuinaCasa().setNombreDeFogons(4);
        casaPare.getCuinaCasa().setEsIndependet(true);
    }
}
