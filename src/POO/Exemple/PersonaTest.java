package Exemple;

import java.util.Scanner;

public class PersonaTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Demana el nom de la persona1: ");
        String nomPersona1 = sc.nextLine();
        System.out.print("Demana l'edat de la persona1: ");
        int edat1 = sc.nextInt();sc.nextLine();

        System.out.print("Demana el nom de la persona2: ");
        String nomPersona2 = sc.nextLine();
        System.out.print("Demana l'edat de la persona2: ");
        int edat2 = sc.nextInt();

        sc.close();

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        persona1.setNom(nomPersona1);
        persona1.setEdat(edat1);
        persona2.setNom(nomPersona2);
        persona2.setEdat(edat2);

        System.out.println("El nom de la persona1 es: "+persona1.getNom()+" i l'edat es: "+persona1.getEdat());
        System.out.println("El nom de la persona2 es: "+persona2.getNom()+" i l'edat es: "+persona2.getEdat());

        persona1.saluda();
        persona2.saluda();
    }
}
