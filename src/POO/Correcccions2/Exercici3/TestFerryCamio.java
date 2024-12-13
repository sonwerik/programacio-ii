package POO.Correcccions2.Exercici3;

public class TestFerryCamio  {
    public static void main(String[] args) {
        Ferri ferri = new Ferri("FR123", "Ferry Blau", "Barcelona", 10.5, 50.0);

        Camio camio1 = new Camio("1234ABC", 10.0);
        Camio camio2 = new Camio("5678DEF", 15.0);
        Camio camio3 = new Camio("9101GHI", 25.0);
        Camio camio4 = new Camio("1112JKL", 5.0);

        System.out.println("Intentant embarcar camions...");
        System.out.println("Camió 1: " + ferri.embarcarCamio(camio1));
        System.out.println("Camió 2: " + ferri.embarcarCamio(camio2));
        System.out.println("Camió 3: " + ferri.embarcarCamio(camio3));
        System.out.println("Camió 4: " + ferri.embarcarCamio(camio4));

        System.out.println("\nPes total dels camions embarcats: " + ferri.calcularPesTotal() + " Tm");
        System.out.println("Camió en la 2a posició: " + ferri.obtenirCamioNEsimaPosicio(2));

        System.out.println("\nEl camió amb matrícula 5678DEF està embarcat? " + ferri.estaEmbarcat("5678DEF"));
        System.out.println("El camió amb matrícula 1112JKL està embarcat? " + ferri.estaEmbarcat("1112JKL"));

        System.out.println("\nPeatge del camió 9101GHI: " + ferri.calcularPeatgeCamio("9101GHI") + " €");
        System.out.println("Peatge total recaptat: " + ferri.calcularPeatgeTotal() + " €");
    }
}