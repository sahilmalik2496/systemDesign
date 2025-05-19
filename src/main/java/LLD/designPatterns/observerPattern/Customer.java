package LLD.designPatterns.observerPattern;

public class Customer implements Observer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String productName) {
        System.out.println("Hello " + name + ", '" + productName + "' is now back in stock!");
    }
}

