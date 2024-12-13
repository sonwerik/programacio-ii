package POO.Correcccions2.Exercici4;

import java.util.ArrayList;
import java.util.List;

public class Telefonia {
    private List<Client> clients;

    public Telefonia() {
        this.clients = new ArrayList<>();
    }

    public boolean afegirClient(Client client) {
        if (clients.stream().anyMatch(c -> c.getDni().equals(client.getDni()))) {
            return false; // No es poden repetir clients amb el mateix DNI
        }
        clients.add(client);
        return true;
    }

    public Client buscarClient(String dni) {
        return clients.stream().filter(c -> c.getDni().equals(dni)).findFirst().orElse(null);
    }

    public void mostrarFactura(String dni) {
        Client client = buscarClient(dni);
        if (client != null) {
            System.out.println("Detall de la factura:");
            System.out.println(client);
            System.out.println("Trucades: " + client.getTrucades());
            System.out.println("Total minuts parlats: " + client.calcularTotalMinuts());
            System.out.println("Total factura: " + client.calcularTotalFactura() + " €");
        } else {
            System.out.println("No s'ha trobat cap client amb el DNI: " + dni);
        }
    }

    public void llistarClients() {
        System.out.println("Llistat de tots els clients:");
        for (Client client : clients) {
            System.out.println(client + ", Minuts totals: " + client.calcularTotalMinuts() +
                    ", Import total: " + client.calcularTotalFactura() + " €");
        }
    }

    public static void main(String[] args) {
        Telefonia telefonia = new Telefonia();

        // Afegir clients
        Client client1 = new Client("12345678A", "Joan Garcia", 0.1);
        Client client2 = new Client("87654321B", "Anna Martínez", 0.15);
        telefonia.afegirClient(client1);
        telefonia.afegirClient(client2);

        // Afegir trucades
        client1.afegirTrucada(new Trucada("654321987", 10));
        client1.afegirTrucada(new Trucada("987654321", 20));
        client2.afegirTrucada(new Trucada("123456789", 15));

        // Mostrar factura d'un client
        telefonia.mostrarFactura("12345678A");

        // Llistar clients amb resum de dades
        telefonia.llistarClients();
    }
}