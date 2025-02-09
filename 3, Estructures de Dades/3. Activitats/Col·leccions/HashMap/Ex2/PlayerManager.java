package Collections.HashMap.Ex2;

import java.util.*;

class PlayerManager {
    private HashMap<Integer, Player> players;

    public PlayerManager() {
        players = new HashMap<>();
    }

    public void addPlayer(int dorsal, Player player) {
        if (!players.containsKey(dorsal)) {
            players.put(dorsal, player);
            System.out.println("Jugador afegit: " + player);
        } else {
            System.out.println("Error: El dorsal " + dorsal + " ja està ocupat.");
        }
    }

    public void searchPlayerByDorsal(int dorsal) {
        if (players.containsKey(dorsal)) {
            System.out.println("Jugador trobat pel dorsal " + dorsal + ": " + players.get(dorsal));
        } else {
            System.out.println("No es va trobar cap jugador amb el dorsal " + dorsal);
        }
    }

    public void searchPlayerByName(String name) {
        boolean found = false;
        for (Player player : players.values()) {
            if (player.getName().equalsIgnoreCase(name)) {
                System.out.println("Jugador trobat pel nom " + name + ": " + player);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No es va trobar cap jugador amb el nom " + name);
        }
    }

    public void listPlayersByDorsal() {
        System.out.println("\nJugadors ordenats per dorsal:");
        players.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }

    public void listPlayersByAge() {
        System.out.println("\nJugadors ordenats per edat:");
        players.values().stream()
                .sorted(Comparator.comparingInt(Player::getAge))
                .forEach(player -> System.out.println(player));
    }

    public void listPlayersByPosition() {
        System.out.println("\nJugadors ordenats per posició:");
        players.values().stream()
                .sorted(Comparator.comparing(Player::getPosition))
                .forEach(player -> System.out.println(player));
    }
}