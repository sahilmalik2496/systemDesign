package machineCoding.stockBroking;

public class Portfolio {
    private Map<String, Integer> holdings = new HashMap<>();

    public void addStock(String stockId, int quantity) {
        holdings.put(stockId, holdings.getOrDefault(stockId, 0) + quantity);
    }

    public void removeStock(String stockId, int quantity) {
        holdings.put(stockId, holdings.getOrDefault(stockId, 0) - quantity);
    }

    public Map<String, Integer> getHoldings() {
        return holdings;
    }
}
