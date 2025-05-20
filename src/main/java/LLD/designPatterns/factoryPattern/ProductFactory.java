package LLD.designPatterns.factoryPattern;

public class ProductFactory {
    public Product getProduct(String type) {
        if (type.equalsIgnoreCase("Book")) return new Book();
        if (type.equalsIgnoreCase("Electronics")) return new Electronics();
        return null;
    }
}
