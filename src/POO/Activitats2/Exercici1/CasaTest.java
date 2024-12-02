package POO.Activitats2.Exercici1;

public class CasaTest {
    public static void main(String[] args) {
        Casa casaMare = new Casa();
        Casa casaPare = new Casa();

        Sala menjadorGranCasaMare = new Sala();
        Sala menjadorPetitCasaMare = new Sala();
        Sala menjadroCasaPare = new Sala();

        Cuina cuinaCasaMare = new Cuina();
        Cuina cuinaCasaPare = new Cuina();

        casaMare.setDireccio("C/ Rocafort 167");
        casaMare.setSuperficie(120);
        casaMare.setSalaCasa(menjadorGranCasaMare);
        casaMare.setSalaCasa(menjadorPetitCasaMare);
        casaMare.setCuinaCasa(cuinaCasaMare);
        casaMare.getSalaCasa().setTipusSala("Menjador");
        casaMare.getSalaCasa().setNumeroDeTelevisions(2);
        casaMare.getCuinaCasa().setNombreDeFogons(6);
        casaMare.getCuinaCasa().setEsIndependet(true);

        casaPare.setDireccio("C/ Gran Via de les Corts Catalanes 859");
        casaPare.setSuperficie(85);
        casaPare.setSalaCasa(menjadroCasaPare);
        casaPare.getSalaCasa().setTipusSala("Menjador");
        casaPare.setCuinaCasa(cuinaCasaPare);
    }
}
