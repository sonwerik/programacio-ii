package POO.Activitats1.Exercici8;

public class TestPlayer {
    public static void main(String[] args) {
        Position initialPosition = new Position(5, 5);
        Player player = new Player(initialPosition, "Èrik");

        System.out.println(player);

        player.moveRight();
        player.jump();
        System.out.println("After moving right and jumping: " + player);

        player.moveLeft();
        player.fall();
        System.out.println("After moving left and falling: " + player);

        player.setName("Nico");
        System.out.println("Name changed: " + player);
    }
}