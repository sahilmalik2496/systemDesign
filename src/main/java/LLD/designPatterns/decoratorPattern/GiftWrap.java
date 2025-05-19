package LLD.designPatterns.decoratorPattern;

public class GiftWrap extends OrderDecorator {
    public GiftWrap(Order order) {
        super(order);
    }

    public String getDescription() {
        return super.getDescription() + ", Gift Wrap";
    }

    public double getCost() {
        return super.getCost() + 50;
    }
}

