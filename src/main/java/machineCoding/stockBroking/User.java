package machineCoding.stockBroking;

public class User {
    private String userId;
    private String name;
    private String email;
    private Portfolio portfolio;

    public User(String userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.portfolio = new Portfolio();
    }

    public String getUserId() { return userId; }
    public Portfolio getPortfolio() { return portfolio; }
}