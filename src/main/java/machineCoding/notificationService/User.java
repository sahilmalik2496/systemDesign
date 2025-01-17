package machineCoding.notificationService;

import java.util.Set;

public class User {
    private final String email;
    private final Set<String> whitelistedLOBs;

    public User(String email, Set<String> whitelistedLOBs) {
        this.email = email;
        this.whitelistedLOBs = whitelistedLOBs;
    }

    public String getEmail() {
        return email;
    }

    public Set<String> getWhitelistedLOBs() {
        return whitelistedLOBs;
    }

    @Override
    public String toString() {
        return "User{email='" + email + "', whitelistedLOBs=" + whitelistedLOBs + '}';
    }
}

