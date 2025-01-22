package machineCoding.restaurantManagementSystem;

import java.util.List;

public class RestaurantManagementSystem {
    private final Menu menu;

    public RestaurantManagementSystem(Menu menu) {
        this.menu = menu;
    }

    public static void main(String[] args) {
        // Initialize restaurant
        Restaurant restaurant = new Restaurant(q.this, "The Gourmet Spot", "Downtown");

        // Add dishes to menu
        restaurant.addDishToMenu(new Dish("Pasta", 12.99, DishCategory.MAIN_COURSE));
        restaurant.addDishToMenu(new Dish("Ice Cream", 4.99, DishCategory.DESSERT));
        restaurant.addDishToMenu(new Dish("Cola", 1.99, DishCategory.BEVERAGE));

        // Add tables
        restaurant.addTable(new TableReservation(1, 4));
        restaurant.addTable(new TableReservation(2, 2));

        // Display menu
        restaurant.displayMenu();

        // Customer reservation
        Customer customer = new Customer("Alice", "123-456-7890");
        restaurant.reserveTableForCustomer(customer);

        // Place an order
        List<Dish> orderedDishes = List.of(
                new Dish("Pasta", 12.99, DishCategory.MAIN_COURSE),
                new Dish("Cola", 1.99, DishCategory.BEVERAGE)
        );
        Order order = new Order(orderedDishes);
        System.out.println(order.getOrderDetails());

        // Process payment
        Payment payment = new Payment(order.calculateTotal(), PaymentMode.CREDIT_CARD);
        if (payment.isSuccessful()) {
            System.out.println("Payment successful!");
        }
    }
}
