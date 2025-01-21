package machineCoding.pizzaStore;

import java.util.Arrays;

public class PizzaStore {
    public static void main(String[] args) {
        Base base = new Base("Thin Crust", 100);
        Size size = new Size("Large", 200);
        Topping cheese = new Topping("Cheese", 50);
        Topping pepperoni = new Topping("Pepperoni", 70);

        Pizza pizza = new Pizza(base, size, Arrays.asList(cheese, pepperoni));
        System.out.println("Total Price: ₹" + pizza.calculatePrice());
    }
}
