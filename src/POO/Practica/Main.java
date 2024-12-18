package POO.Practica;

public class Main {
    public static void main(String[] args) {

        Stock player1 = new Stock();

        Character ch1 = new Character("Ethan", "Worker", 2200, 280, false);
        Character ch2 = new Character("Jack", "Worker", 1500, 250, false);
        Character ch3 = new Character("James", "Farmer", 1800, 350, false);
        Character ch4 = new Character("Dylan", "Farmer", 2000, 200, false);
        Character ch5 = new Character("Michael", "Soldier", 3200, 450, false);
        Character ch6 = new Character("Jinx", "Soldier", 2700, 350, false);
        Character ch7 = new Character("Kelvin", "Politician", 900, 75, false);
        Character ch8 = new Character("Jordan", "Politician", 2300, 200, false);

        player1.addCharacter(ch1);
        player1.addCharacter(ch2);
        player1.addCharacter(ch3);
        player1.addCharacter(ch4);
        player1.addCharacter(ch5);
        player1.addCharacter(ch6);
        player1.addCharacter(ch7);
        player1.addCharacter(ch8);

        System.out.println("\nCHARACTERS PURCHASE");
        System.out.println("---------------------------------------");

        for (Character ch : player1.getCharacters()) {
            if (player1.getPurchaseBudget() <= 0) {
                break;
            }
            if (player1.buyCharacter(ch)) {
                System.out.println("Purchase made succesfully" + "\n  " + ch);
            } else {
                System.out.println("Purchase not made");
                break;
            }
        }
        System.out.println();
        player1.inventory();
    }
}