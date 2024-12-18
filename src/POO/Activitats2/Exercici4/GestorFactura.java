package POO.Activitats2.Exercici4;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorFactura {
    private static ArrayList<Client> clients;

    public GestorFactura() {
        clients = new ArrayList<>();
    }

    public void afegirClient() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix el DNI: ");
        String dni = sc.next().toUpperCase();

        boolean existeix = false;

        for (Client c : clients) {
            if (c.getDni().equals(dni)) {
                existeix = true;
                break;
            }
        }

        if (existeix) {
            System.out.println("Aquest DNI ja està registrat.");
        } else {
            System.out.print("Introdueix el nom del client: ");
            sc.nextLine();String nom = sc.nextLine();

            System.out.print("Introdueix el preu per minut (€): ");
            double preuPerMinut = sc.nextDouble();

            Client nouClient = new Client(dni, nom, preuPerMinut);
            clients.add(nouClient);
            System.out.println("Client afegit correctament!");
        }
    }

    public void afigirTrucadaAClient() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix el DNI: ");
        String dni = sc.next().toUpperCase();

        boolean trobat = false;
        for (Client c : clients) {
            if (c.getDni().equals(dni)) {
                System.out.print("Introdueix el destinatari de la trucada: ");
                sc.nextLine();String destinatari = sc.nextLine();

                System.out.print("Introdueix la durada de la trucada (en minuts): ");
                int durada = sc.nextInt();

                c.afegirTrucada(destinatari, durada);
                System.out.println("Trucada afegida correctament!");
                trobat = true;
                break;
            }
        }

        if (!trobat) {
            System.out.println("DNI no trobat.");
        }
    }

    public void facturaClient() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix el DNI: ");
        String dni = sc.next().toUpperCase();

        boolean trobat = false;
        for (Client c : clients) {
            if (c.getDni().equals(dni)) {
                System.out.println(c);
                trobat = true;
                break;
            }
        }

        if (!trobat) {
            System.out.println("DNI no trobat.");
        }
    }

    public void llistaClients() {
        if (clients.isEmpty()) {
            System.out.println("No hi ha clients registrats.");
        } else {
            System.out.println("Llista de clients:");
            for (Client c : clients) {
                System.out.println("DNI: " + c.getDni() + ", Nom: " + c.getNom() + ", Trucades: " + c.getTrucades().size() +
                        ", Total factura: " + c.calcularFactura() + " €");
            }
        }
    }


    public static void main(String[] ignoredArgs) {
        GestorFactura gestor = new GestorFactura();
        Scanner sc = new Scanner(System.in);
        boolean sortir = false;

        while (!sortir) {
            System.out.println("""
                    \nMENU PRINCIPAL
                    1. Afegir client
                    2. Afegir trucada a un client
                    3. Generar factura d'un client
                    4. Llistar clients
                    0. Sortir
                    """);
            System.out.print("Selecciona una opció: ");
            int opcio = sc.nextInt();

            switch (opcio) {
                case 1:
                    gestor.afegirClient();
                    break;
                case 2:
                    gestor.afigirTrucadaAClient();
                    break;
                case 3:
                    gestor.facturaClient();
                    break;
                case 4:
                    gestor.llistaClients();
                    break;
                case 0:
                    sortir = true;
                    System.out.println("Sortint del programa.");
                    break;
                default:
                    System.out.println("Opció no vàlida. Torna-ho a intentar.");
                    break;
            }
        }
    }
}