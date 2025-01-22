package machineCoding.stockBroking;

public class Stock {
    private String stockId;
    private String companyName;
    private double currentPrice;

    public Stock(String stockId, String companyName, double currentPrice) {
        this.stockId = stockId;
        this.companyName = companyName;
        this.currentPrice = currentPrice;
    }

    public String getStockId() {
        return stockId;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void updatePrice(double newPrice) {
        this.currentPrice = newPrice;
    }
}
