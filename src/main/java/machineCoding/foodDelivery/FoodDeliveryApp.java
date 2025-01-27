package machineCoding.foodDelivery;

import java.util.Arrays;

// Driver Class
public class FoodDeliveryApp {
    public static void main(String[] args) {
        // Create Users
        User user1 = new User("U001", "Sahil", "sahil@example.com", "123 Street, City", "9999999999");

        // Create Dishes
        Dish dish1 = new Dish("D001", "Paneer Butter Masala", 250, "Delicious paneer in buttery gravy");
        Dish dish2 = new Dish("D002", "Butter Naan", 50, "Soft naan with butter topping");

        // Create Menu
        Menu menu = new Menu("M001");
        menu.addDish(dish1);
        menu.addDish(dish2);

        // Create Restaurant
        Restaurant restaurant = new Restaurant("R001", "Punjabi Tadka", "456 Avenue, City", 4.5, menu);

        // Place Order
        user1.placeOrder(restaurant, Arrays.asList(dish1, dish2));
    }
}
