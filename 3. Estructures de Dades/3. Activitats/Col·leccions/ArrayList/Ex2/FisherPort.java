package Collections.ArrayList.Ex2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class FisherPort {
    private static ArrayList<Ship> ships = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Afegir vaixell");
            System.out.println("2. Buscar vaixell per nom");
            System.out.println("3. Modificar vaixell");
            System.out.println("4. Eliminar vaixell");
            System.out.println("5. Llistar vaixells");
            System.out.println("6. Sortir");
            System.out.print("Escull una opció: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> addShip();
                case 2 -> searchShip();
                case 3 -> modifyShip();
                case 4 -> removeShip();
                case 5 -> listShips();
                case 6 -> System.out.println("Sortint del programa...");
                default -> System.out.println("Opció no vàlida, torna-ho a provar.");
            }
        } while (option != 6);
    }

    public static void addShip() {
        System.out.print("Nom del vaixell: ");
        String name = scanner.nextLine();
        System.out.print("Preu del vaixell (€): ");
        double price = scanner.nextDouble();
        System.out.print("Edat del vaixell (anys): ");
        int age = scanner.nextInt();
        scanner.nextLine();

        ships.add(new Ship(name, price, age));
        System.out.println("Vaixell afegit correctament!");
    }

    public static void searchShip() {
        System.out.print("Nom del vaixell a buscar: ");
        String name = scanner.nextLine();
        for (Ship ship : ships) {
            if (ship.getName().equalsIgnoreCase(name)) {
                System.out.println(ship);
                return;
            }
        }
        System.out.println("Vaixell no trobat.");
    }

    public static void modifyShip() {
        System.out.print("Nom del vaixell a modificar: ");
        String name = scanner.nextLine();
        for (Ship ship : ships) {
            if (ship.getName().equalsIgnoreCase(name)) {
                System.out.print("Nou preu (€): ");
                double price = scanner.nextDouble();
                System.out.print("Nova edat (anys): ");
                int age = scanner.nextInt();
                scanner.nextLine();

                ship.setPrice(price);
                ship.setAge(age);
                System.out.println("Vaixell modificat correctament!");
                return;
            }
        }
        System.out.println("Vaixell no trobat.");
    }

    public static void removeShip() {
        System.out.print("Nom del vaixell a eliminar: ");
        String name = scanner.nextLine();
        for (int i = 0; i < ships.size(); i++) {
            if (ships.get(i).getName().equalsIgnoreCase(name)) {
                ships.remove(i);
                System.out.println("Vaixell eliminat correctament.");
                return;
            }
        }
        System.out.println("Vaixell no trobat.");
    }

    public static void listShips() {
        if (ships.isEmpty()) {
            System.out.println("No hi ha vaixells al port.");
            return;
        }

        System.out.println("\nOrdenacions disponibles:");
        System.out.println("1. Per antiguitat (de més vell a més nou)");
        System.out.println("2. Per nom (ordre alfabètic)");
        System.out.println("3. Per preu (de més car a més barat)");
        System.out.print("Escull una opció: ");
        int option = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Ship> sortedShips = new ArrayList<>(ships);

        switch (option) {
            case 1 -> sortedShips.sort(Comparator.comparingInt(Ship::getAge).reversed());
            case 2 -> sortedShips.sort(Comparator.comparing(Ship::getName));
            case 3 -> sortedShips.sort(Comparator.comparingDouble(Ship::getPrice).reversed());
            default -> {
                System.out.println("Opció no vàlida.");
                return;
            }
        }

        for (Ship ship : sortedShips) {
            System.out.println(ship);
        }
    }
}
