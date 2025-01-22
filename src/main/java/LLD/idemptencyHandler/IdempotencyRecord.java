package LLD.idemptencyHandler;

public class IdempotencyRecord {
    private final String idempotencyKey;
    private final String requestPayload;
    private String responsePayload;
    private String status;

    public IdempotencyRecord(String idempotencyKey, String requestPayload, String responsePayload, String status) {
        this.idempotencyKey = idempotencyKey;
        this.requestPayload = requestPayload;
        this.responsePayload = responsePayload;
        this.status = status;
    }

    public String getIdempotencyKey() {
        return idempotencyKey;
    }

    public String getRequestPayload() {
        return requestPayload;
    }

    public String getResponsePayload() {
        return responsePayload;
    }

    public void setResponsePayload(String responsePayload) {
        this.responsePayload = responsePayload;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
