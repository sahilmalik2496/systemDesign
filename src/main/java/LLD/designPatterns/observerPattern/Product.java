package LLD.designPatterns.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {
    private String productName;
    private boolean inStock = false;
    private List<Observer> observers = new ArrayList<>();

    public Product(String productName) {
        this.productName = productName;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(productName);
        }
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
        if (inStock) {
            notifyObservers();
        }
    }
}

