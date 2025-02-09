package Collections.HashSet.Ex1;

public class TestLottery {
    public static void main(String[] args) {
        Player player1 = new Player("34562343A");
        Player player2 = new Player("98754282L");
        Player player3 = new Player("43572893Z");
        Player player4 = new Player("09875419F");

        Lottery lottery = new Lottery();

        lottery.addPlayer(player1);
        lottery.addPlayer(player2);
        lottery.addPlayer(player3);
        lottery.addPlayer(player4);

        System.out.println("Tiquets dels jugadors:");
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(player4);

        lottery.play();
    }
}
