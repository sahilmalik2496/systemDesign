package machineCoding.pizzaStore;

public class Base {
    private String type;
    private double price;

    public Base(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
}
