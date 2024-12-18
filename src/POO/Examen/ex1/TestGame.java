package POO.Examen.ex1;

public class TestGame {
    public static void main(String[] args) {

        Weapon defautlWeapon = new Weapon("Default", 10, 1.5);
        Weapon axe = new Weapon("Axe", 40, 3);
        Weapon arrow = new Weapon("Arrow", 70, 10);

        System.out.println("\nWEAPONS");
        System.out.println(defautlWeapon);
        System.out.println(axe);
        System.out.println(arrow);

        Position defaultPosition = new Position();

        Player player1 = new Player("Player1", defaultPosition, defautlWeapon);
        Player player2 = new Player("Player2", new Position(2,2), axe);

        System.out.println("\nPLAYERS");
        System.out.println(player1);
        System.out.println(player2);

        player2.moveTo(new Position(1,1));
        System.out.println("\nPLAYER2 MOVED");
        System.out.println(player2);

        System.out.println("\nPLAYER2 ATTACK PLAYER1");

    }
}
