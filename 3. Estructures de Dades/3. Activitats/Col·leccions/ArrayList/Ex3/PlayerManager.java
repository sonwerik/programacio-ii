package Collections.ArrayList.Ex3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class PlayerManager {
    private ArrayList<Player> players;

    public PlayerManager() {
        players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayerByName(String name) {
        players.removeIf(player -> player.getName().equalsIgnoreCase(name));
    }

    public Player getPlayerByName(String name) {
        for (Player player : players) {
            if (player.getName().equalsIgnoreCase(name)) {
                return player;
            }
        }
        return null;
    }

    public void updatePlayerScore(String name, int newScore) {
        Player player = getPlayerByName(name);
        if (player != null) {
            player.setScore(newScore);
        }
    }

    public List<Player> getTopNPlayers(int N) {
        List<Player> sortedPlayers = new ArrayList<>(players);
        sortedPlayers.sort(Comparator.comparingInt(Player::getScore).reversed());
        return sortedPlayers.subList(0, Math.min(N, sortedPlayers.size()));
    }

    public List<Player> getPlayersWithScoreGreaterThan(int minScore) {
        List<Player> result = new ArrayList<>();
        for (Player player : players) {
            if (player.getScore() > minScore) {
                result.add(player);
            }
        }
        return result;
    }

    public Player getPlayerWithHighestScore() {
        return players.stream().max(Comparator.comparingInt(Player::getScore)).orElse(null);
    }

    public void showAllPlayers() {
        if (players.isEmpty()) {
            System.out.println("No hi ha jugadors.");
        } else {
            for (Player player : players) {
                System.out.println(player);
            }
        }
    }
}