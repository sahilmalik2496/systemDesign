package LLD.designPatterns.decoratorPattern;

public class BasicOrder implements Order {
    @Override
    public String getDescription() {
        return "Product";
    }

    @Override
    public double getCost() {
        return 500.0;
    }
}
