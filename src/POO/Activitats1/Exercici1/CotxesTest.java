package POO.Activitats1.Exercici1;

public class CotxesTest {
    public static void main(String[] args) {

        String marcaCotxe1 = "Toyota";
        String modelCotxe1 = "AE86";
        String matriculaCotxe1 = "1234-BCD";

        String marcaCotxe2 = "Subaru";
        String modelCotxe2 = "BRZ";
        String matriculaCotxe2 = "5678-FGH";

        Cotxe cotxe1 = new Cotxe();
        Cotxe cotxe2 = new Cotxe();

        cotxe1.setMarca(marcaCotxe1);
        cotxe1.setModel(modelCotxe1);
        cotxe1.setMatricula(matriculaCotxe1);

        cotxe2.setMarca(marcaCotxe2);
        cotxe2.setModel(modelCotxe2);
        cotxe2.setMatricula(matriculaCotxe2);

        System.out.println("Cotxe 1: " + cotxe1.getMarca() + " " + cotxe1.getModel() + " - " + cotxe1.getMatricula());
        System.out.println("Cotxe 2: " + cotxe2.getMarca() + " " + cotxe2.getModel() + " - " + cotxe2.getMatricula());

        cotxe1.setMarca(marcaCotxe2);
        cotxe1.setModel(modelCotxe2);
        cotxe1.setMatricula(matriculaCotxe2);

        cotxe2.setMarca(marcaCotxe1);
        cotxe2.setModel(modelCotxe1);
        cotxe2.setMatricula(matriculaCotxe1);

        System.out.println("\nCotxe 1: " + cotxe1.getMarca() + " " + cotxe1.getModel() + " - " + cotxe1.getMatricula());
        System.out.println("Cotxe 2: " + cotxe2.getMarca() + " " + cotxe2.getModel() + " - " + cotxe2.getMatricula());
    }
}