package POO.Examen.ex2;

public class Order {
    private Dish dish;
    private int quantity;

    public Order(Dish dish, int quantity) {
        this.dish = dish;
        this.quantity = quantity;
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float calculateOrderTotal() {
        return dish.getPrice() * quantity;
    }

    public String getDetails() {
        return dish.getName() + " x" + quantity + " - " +dish.getPrice() * quantity + " €";
    }

    @Override
    public String toString() {
        return "Order{" +
                "dish=" + dish +
                ", quantity=" + quantity +
                '}';
    }
}
