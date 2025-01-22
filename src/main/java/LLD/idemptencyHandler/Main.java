package LLD.idemptencyHandler;

public class Main {
    public static void main(String[] args) {
        ApiService apiService = new ApiService();

        String idempotencyKey = "abc123";
        String requestPayload = "{ \"amount\": 100 }";

        // First request
        String response1 = apiService.handleRequest(idempotencyKey, requestPayload);
        System.out.println(response1); // Processed: { "amount": 100 }

        // Duplicate request
        String response2 = apiService.handleRequest(idempotencyKey, requestPayload);
        System.out.println(response2); // Processed: { "amount": 100 }
    }
}