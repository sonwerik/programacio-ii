package Collections.ArrayList.Ex3;

public class TestPlayerManager {
    public static void main(String[] args) {
        PlayerManager playerManager = new PlayerManager();

        Player player1 = new Player("Èrik", 100);
        Player player2 = new Player("Pep", 200);
        Player player3 = new Player("Alberto", 150);
        Player player4 = new Player("Ginés", 50);
        Player player5 = new Player("Oscar", 300);

        playerManager.addPlayer(player1);
        playerManager.addPlayer(player2);
        playerManager.addPlayer(player3);
        playerManager.addPlayer(player4);
        playerManager.addPlayer(player5);

        System.out.println("Tots els jugadors:");
        playerManager.showAllPlayers();

        System.out.println("\nJugador amb més puntuació:");
        System.out.println(playerManager.getPlayerWithHighestScore());

        playerManager.updatePlayerScore("Alberto", 250);
        System.out.println("\nPuntuació actualitzada per Alberto:");
        System.out.println(playerManager.getPlayerByName("Alberto"));

        System.out.println("\nMillors 3 jugadors:");
        for (Player player : playerManager.getTopNPlayers(3)) {
            System.out.println(player);
        }

        System.out.println("\nJugadors amb puntuació superior a 100:");
        for (Player player : playerManager.getPlayersWithScoreGreaterThan(100)) {
            System.out.println(player);
        }

        playerManager.removePlayerByName("Ginés");
        System.out.println("\nJugadors després d'eliminar Ginés:");
        playerManager.showAllPlayers();
    }
}