package Collections.HashSet.Ex4;

public class TestGame {
    public static void main(String[] args) {
        Game game = new Game();

        for (int i = 1; i <= 5; i++) {
            game.addPlayer(new Player("Lladre" + i, "Lladre"));
            game.addPlayer(new Player("Policia" + i, "Policia"));
        }

        game.showGameStatus();

        game.eliminatePlayer("Lladre1");
        game.eliminatePlayer("Policia1");

        game.showGameStatus();

        if (game.isGameOver()) {
            System.out.println("El joc s'ha acabat!");
        } else {
            System.out.println("El joc encara està en curs.");
        }

        game.eliminatePlayer("Lladre2");
        game.eliminatePlayer("Policia2");

        game.showGameStatus();

        if (game.isGameOver()) {
            System.out.println("El joc s'ha acabat!");
        } else {
            System.out.println("El joc encara està en curs.");
        }
    }
}