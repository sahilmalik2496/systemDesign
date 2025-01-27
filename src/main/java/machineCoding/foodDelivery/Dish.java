package machineCoding.foodDelivery;

// Dish Class
class Dish {
    private String dishId;
    private String name;
    private double price;
    private String description;
    private boolean availability;

    public Dish(String dishId, String name, double price, String description) {
        this.dishId = dishId;
        this.name = name;
        this.price = price;
        this.description = description;
        this.availability = true;
    }

    public double getPrice() {
        return price;
    }
}

