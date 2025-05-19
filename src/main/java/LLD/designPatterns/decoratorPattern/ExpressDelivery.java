package LLD.designPatterns.decoratorPattern;

public class ExpressDelivery extends OrderDecorator {
    public ExpressDelivery(Order order) {
        super(order);
    }

    public String getDescription() {
        return super.getDescription() + ", Express Delivery";
    }

    public double getCost() {
        return super.getCost() + 100;
    }
}
