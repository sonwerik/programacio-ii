package POO.Practica;

public class Character {
    private String name;
    private int maxPower; // max 100 points.
    private double price;
    private boolean sold;
    private String type;

    public Character(String name, String type, int maxPower, double price, boolean sold) {
        this.name = name;
        this.type = type;
        this.maxPower = maxPower;
        this.price = price;
        this.sold = sold;
    }

    public Character() {
        this.name = "";
        this.type = "";
        this.maxPower = 0;
        this.price = 0.0;
        this.sold = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(int maxPower) {
        this.maxPower = maxPower;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", maxPower=" + maxPower +
                ", price=" + price +
                ", sold=" + sold +
                '}';
    }
}