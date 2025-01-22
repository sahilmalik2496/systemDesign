package machineCoding.restaurantManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Menu {
    private List<Dish> dishes;

    public Menu() {
        this.dishes = new ArrayList<>();
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public List<Dish> getDishesByCategory(DishCategory category) {
        return dishes.stream()
                .filter(dish -> dish.getCategory() == category)
                .collect(Collectors.toList());
    }

    public void displayMenu() {
        dishes.forEach(dish -> System.out.println(dish.getName() + " - $" + dish.getPrice() + " (" + dish.getCategory() + ")"));
    }
}