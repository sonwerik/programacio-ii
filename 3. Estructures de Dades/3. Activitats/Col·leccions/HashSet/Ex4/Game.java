package Collections.HashSet.Ex4;

import java.util.HashSet;

class Game {
    private HashSet<Player> activePlayers;
    private HashSet<Player> eliminatedPlayers;

    public Game() {
        activePlayers = new HashSet<>();
        eliminatedPlayers = new HashSet<>();
    }

    public void addPlayer(Player player) {
        activePlayers.add(player);
    }

    public void eliminatePlayer(String playerName) {
        for (Player player : activePlayers) {
            if (player.getName().equals(playerName)) {
                activePlayers.remove(player);
                eliminatedPlayers.add(player);
                break;
            }
        }
    }

    public boolean isGameOver() {
        boolean allThievesEliminated = true;
        boolean allPoliceEliminated = true;

        for (Player player : eliminatedPlayers) {
            if (player.getRole().equals("Lladre")) {
                allThievesEliminated = true;
            } else if (player.getRole().equals("Policia")) {
                allPoliceEliminated = true;
            } else {
                allThievesEliminated = false;
                allPoliceEliminated = false;
            }
        }

        return allThievesEliminated || allPoliceEliminated;
    }

    public void showGameStatus() {
        System.out.println("Jugadors actius: " + activePlayers);
        System.out.println("Jugadors eliminats: " + eliminatedPlayers);
    }
}