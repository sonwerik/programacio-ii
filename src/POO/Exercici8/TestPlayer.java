package POO.Exercici8;

public class TestPlayer {
    public static void main(String[] args) {
        Position initialPosition = new Position(5, 5);
        Player player = new Player(initialPosition, "Player1");

        System.out.println(player);

        player.moveRight();
        player.jump();
        System.out.println("After moving right and jumping: " + player);

        player.moveLeft();
        player.fall();
        System.out.println("After moving left and falling: " + player);

        player.setName("PlayerX");
        System.out.println("Name changed: " + player);
    }
}