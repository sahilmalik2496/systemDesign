package machineCoding.paymentRecommandationService;

public class UserContext {
    private boolean isUPIEnabled;

    public UserContext(boolean isUPIEnabled) {
        this.isUPIEnabled = isUPIEnabled;
    }

    public boolean isUPIEnabled() {
        return isUPIEnabled;
    }
}
