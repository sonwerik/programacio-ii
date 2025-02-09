package POO.Examen.ex2;

import java.util.ArrayList;

public class    Table {
    private int tableNumber;
    private ArrayList<Order> orders;

    public Table (int tableNumber) {
        this.tableNumber = tableNumber;
        this.orders = new ArrayList<>();
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public void addOrder(Order order) {
        System.out.println("Dish added: " + order.getDetails() + " a la taula " + tableNumber);
        this.orders.add(order);
    }

    public void calculateTotalBill() {
        float totalBill = 0;
        for (Order order : orders) {
            totalBill += order.getDish().getPrice() * order.getQuantity();
        }
        System.out.println("Total bill: " + totalBill + " €");
    }

    public void listOrders() {
        System.out.println("\nTable " + tableNumber + ":");
        for (Order order : orders) {
            System.out.println("  - " + order.getDetails());
        }
    }

    @Override
    public String toString() {
        return "Table{" +
                "tableNumber=" + tableNumber +
                ", orders=" + orders +
                '}';
    }
}