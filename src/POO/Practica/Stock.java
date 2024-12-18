package POO.Practica;

import java.util.ArrayList;

public class Stock {
    private ArrayList<Character> characters;
    private double purchaseBudget;
    private double spent;

    public Stock() {
        this.characters = new ArrayList<>();
        this.purchaseBudget = 1000;
        this.spent = 0;
    }

    public ArrayList<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(ArrayList<Character> characters) {
        this.characters = characters;
    }

    public double getPurchaseBudget() {
        return purchaseBudget;
    }

    public void setPurchaseBudget(double purchaseBudget) {
        this.purchaseBudget = purchaseBudget;
    }

    public double getSpent() {
        return spent;
    }

    public void setSpent(double spent) {
        this.spent = spent;
    }

public boolean buyCharacter(Character character) {
    boolean bought = false;
        if (character.getPrice() <= this.purchaseBudget) {
            this.purchaseBudget -= character.getPrice();
            this.spent += character.getPrice();
            character.setSold(true);
            bought = true;
        } else {
            System.out.println("\nYou don't have enough money");
        }
        return bought;
    }

    public void inventory() {
        for (Character character : characters) {
            if (character.isSold()) {
                System.out.println(character.getType());
            }
        }
    }

    public void addCharacter(Character character) {
        this.characters.add(character);
    }


    @Override
    public String toString() {
        return "Stock{" +
                "characters=" + characters +
                ", purchaseBudget=" + purchaseBudget +
                ", spent=" + spent +
                '}';
    }
}
