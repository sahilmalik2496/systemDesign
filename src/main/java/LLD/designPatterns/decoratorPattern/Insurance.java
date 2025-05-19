package LLD.designPatterns.decoratorPattern;

public class Insurance extends OrderDecorator {
    public Insurance(Order order) {
        super(order);
    }

    public String getDescription() {
        return super.getDescription() + ", Insurance";
    }

    public double getCost() {
        return super.getCost() + 75;
    }
}
