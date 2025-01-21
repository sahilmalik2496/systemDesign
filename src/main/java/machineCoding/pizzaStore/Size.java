package machineCoding.pizzaStore;

public class Size {
    private String name;
    private double price;

    public Size(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
