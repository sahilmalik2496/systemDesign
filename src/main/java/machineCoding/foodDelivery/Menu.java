package machineCoding.foodDelivery;

import java.util.ArrayList;
import java.util.List;

// Menu Class
class Menu {
    private String menuId;
    private List<Dish> dishes;

    public Menu(String menuId) {
        this.menuId = menuId;
        this.dishes = new ArrayList<>();
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public List<Dish> getDishes() {
        return dishes;
    }
}
