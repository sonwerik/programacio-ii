package POO.Examen.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant {
    ArrayList<Dish> menu;
    ArrayList<Table> tables;

    public Restaurant() {
        this.menu = new ArrayList<>();
        this.tables = new ArrayList<>();
    }

    public ArrayList<Dish> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<Dish> menu) {
        this.menu = menu;
    }

    public ArrayList<Table> getTables() {
        return tables;
    }

    public void setTables(ArrayList<Table> tables) {
        this.tables = tables;
    }

    public void addDish(Dish dish) {
        menu.add(dish);
        System.out.println("Dish added: " + dish.getName() + " - " + dish.getPrice() + " €");
    }

    public void addTable(Table table) {
        tables.add(table);
        System.out.println("Table added: Table " + table.getTableNumber());
    }

    public void findDishByName(String dishName) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Search a dish: ");
        dishName = sc.nextLine().toLowerCase();
        boolean found = false;

        for (Dish dish : menu) {
            if (dish.getName().toLowerCase().contains(dishName)) {
                System.out.println(dish.getName());
            }
            found = true;
        }

        if (!found) {
            System.out.println("Dish not found");
        }
    }

    public void listMenu(){
        System.out.println();
        System.out.println("Menu: ");
        for (Dish dish : menu) {
            System.out.println("  - " + dish.getName() + " - " + dish.getPrice() + " €");
        }
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "menu=" + menu +
                ", tables=" + tables +
                '}';
    }
}
