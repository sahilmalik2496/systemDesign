package machineCoding.restaurantManagementSystem;

import java.util.ArrayList;
import java.util.List;

class Restaurant {
    private final Menu menu;
    private String name;
    private String location;
    private Menu menu;
    private List<TableReservation> tables;

    public Restaurant(Menu menu, String name, String location) {
        this.menu = menu;
        this.name = name;
        this.location = location;
        this.menu = new Menu();
        this.tables = new ArrayList<>();
    }

    public void addDishToMenu(Dish dish) {
        menu.addDish(dish);
    }

    public void addTable(TableReservation table) {
        tables.add(table);
    }

    public void displayMenu() {
        System.out.println("Menu for " + name + ":");
        menu.displayMenu();
    }

    public TableReservation findAvailableTable() {
        return tables.stream().filter(TableReservation::isAvailable).findFirst().orElse(null);
    }

    public void reserveTableForCustomer(Customer customer) {
        TableReservation table = findAvailableTable();
        if (table != null) {
            table.reserveTable();
            System.out.println("Table reserved for " + customer.getName());
        } else {
            System.out.println("No tables available");
        }
    }
}
