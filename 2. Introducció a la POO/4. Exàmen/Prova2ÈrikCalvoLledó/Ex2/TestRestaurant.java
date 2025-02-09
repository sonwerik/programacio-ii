package POO.Examen.ex2;

public class TestRestaurant {
    public static void main(String[] args) {

        Restaurant konig = new Restaurant();

        Dish salad = new Dish("Salad", 12.99F);
        Dish hamburger = new Dish("Hamburger", 15.49F);
        Dish soup = new Dish("Soup", 9.99F);
        Dish pasta = new Dish("Pasta", 36.99F);
        Dish pizza = new Dish("Pizza", 11.49F);

        System.out.println();
        konig.addDish(salad);
        konig.addDish(hamburger);
        konig.addDish(soup);
        konig.addDish(pasta);
        konig.addDish(pizza);

        Table table1 = new Table(1);
        Table table2 = new Table(2);
        Table table3 = new Table(3);

        System.out.println();
        konig.addTable(table1);
        konig.addTable(table2);
        konig.addTable(table3);

        Order oder1 = new Order(pasta, 2);
        Order oder2 = new Order(salad, 1);
        Order oder3 = new Order(soup, 1);
        Order oder4 = new Order(pizza, 1);

        System.out.println();
        table1.addOrder(oder1);
        table1.addOrder(oder2);
        table1.addOrder(oder3);
        table1.addOrder(oder4);

        Order oder5 = new Order(pizza, 2);
        Order oder6 = new Order(hamburger, 1);
        Order oder7 = new Order(pasta, 1);

        table2.addOrder(oder5);
        table2.addOrder(oder6);
        table3.addOrder(oder7);

        table1.listOrders();
        table1.calculateTotalBill();

        table2.listOrders();
        table2.calculateTotalBill();

        konig.listMenu();
    }
}
