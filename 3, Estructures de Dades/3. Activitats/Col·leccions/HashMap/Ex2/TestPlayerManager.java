package Collections.HashMap.Ex2;

public class TestPlayerManager {
    public static void main(String[] args) {
        PlayerManager playerManager = new PlayerManager();

        Player player1 = new Player("Leo Messi", 36, "Davanter Dre");
        Player player2 = new Player("Lamine Yamal", 17, "Davanter");
        Player player3 = new Player("Dani Olmo", 26, "Migcampista");
        Player player4 = new Player("Fermín", 21, "Davanter");
        Player player5 = new Player("Ter Stegen", 32, "Porter");

        playerManager.addPlayer(10, player1);
        playerManager.addPlayer(19, player2);
        playerManager.addPlayer(20, player3);
        playerManager.addPlayer(11, player4);
        playerManager.addPlayer(1, player5);

        playerManager.addPlayer(10, new Player("Szczesny", 34, "Porter"));

        System.out.println("\nCercant jugador pel dorsal 10:");
        playerManager.searchPlayerByDorsal(10);

        System.out.println("\nCercant jugador pel nom 'Dani Olmo':");
        playerManager.searchPlayerByName("Dani Olmo");

        playerManager.listPlayersByDorsal();
        playerManager.listPlayersByAge();
        playerManager.listPlayersByPosition();
    }
}