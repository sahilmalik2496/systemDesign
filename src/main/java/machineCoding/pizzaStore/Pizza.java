package machineCoding.pizzaStore;

import java.util.List;

public class Pizza {
    private Base base;
    private Size size;
    private List<Topping> toppings;

    public Pizza(Base base, Size size, List<Topping> toppings) {
        this.base = base;
        this.size = size;
        this.toppings = toppings;
    }

    public double calculatePrice() {
        double totalPrice = base.getPrice() + size.getPrice();
        for (Topping topping : toppings) {
            totalPrice += topping.getPrice();
        }
        return totalPrice;
    }
}
