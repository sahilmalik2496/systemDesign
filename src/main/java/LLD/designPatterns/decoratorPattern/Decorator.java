package LLD.designPatterns.decoratorPattern;

public class Decorator {
    public static void main(String[] args) {
        Order order = new BasicOrder();
        order = new GiftWrap(order);
        order = new ExpressDelivery(order);
        order = new Insurance(order);

        System.out.println("Description: " + order.getDescription());
        System.out.println("Total Cost: ₹" + order.getCost());
    }
}
