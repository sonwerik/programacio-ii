package POO.Activitats2.Exercici5;

import java.time.LocalDate;

public class TestContractes {
    public static void main(String[] args) {
        Empresa empresa1 = new Empresa("A123", "TechCorp", "Tecnologia");
        Empresa empresa2 = new Empresa("B456", "Foodies", "Alimentació");

        Persona persona = new Persona("12345678A", "Joan Garcia");

        Contracte contracte1 = new Contracte("C1", LocalDate.of(2022, 1, 1), LocalDate.of(2022, 6, 1), empresa1);
        Contracte contracte2 = new Contracte("C2", LocalDate.of(2022, 7, 1), LocalDate.of(2022, 12, 31), empresa2);
        Contracte contracte3 = new Contracte("C3", LocalDate.of(2023, 1, 1), LocalDate.of(2023, 3, 1), empresa1);

        persona.afegirContracte(contracte1);
        persona.afegirContracte(contracte2);
        persona.afegirContracte(contracte3);

        System.out.println("Detall dels contractes:");
        System.out.println(persona);

        System.out.println("\nDurada total dels contractes: " + persona.calcularDuradaTotalContractes() + " dies");
        System.out.println("Nombre d'empreses diferents on ha treballat: " +
                persona.calcularNombreEmpresesDiferents());
    }
}