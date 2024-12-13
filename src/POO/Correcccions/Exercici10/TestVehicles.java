package POO.Correcccions.Exercici10;

public class TestVehicles {
    public static void main(String[] args) {
        // Crear vehicles
        Cotxe cotxe = new Cotxe("1234ABC", 5, 4);
        Microbus microbus = new Microbus("5678DEF", 3, 20);
        VehicleCarrega furgoneta = new VehicleCarrega("9101GHI", 7, 3.5);
        Camio camio = new Camio("1122JKL", 10, 8.0);

        // Mostrar detalls i preus
        System.out.println(cotxe);
        System.out.println("Preu del lloguer: " + cotxe.calcularPreu() + " €");

        System.out.println(microbus);
        System.out.println("Preu del lloguer: " + microbus.calcularPreu() + " €");

        System.out.println(furgoneta);
        System.out.println("Preu del lloguer: " + furgoneta.calcularPreu() + " €");

        System.out.println(camio);
        System.out.println("Preu del lloguer: " + camio.calcularPreu() + " €");
    }
}