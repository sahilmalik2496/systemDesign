package LLD.designPatterns.factoryPattern;

public class Main {
    public static void main(String[] args){
        ProductFactory factory = new ProductFactory();
        Product p1 = factory.getProduct("Book");
        p1.display(); // Book Product

    }
}
