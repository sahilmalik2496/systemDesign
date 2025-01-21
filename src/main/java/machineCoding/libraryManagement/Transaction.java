package machineCoding.libraryManagement;

import java.util.Date;

class Transaction {
    private String transactionId;
    private String bookId;
    private String userId;
    private String type; // borrow, return, reserve
    private Date dueDate;

    public Transaction(String transactionId, String bookId, String userId, String type, Date dueDate) {
        this.transactionId = transactionId;
        this.bookId = bookId;
        this.userId = userId;
        this.type = type;
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId='" + transactionId + '\'' +
                ", bookId='" + bookId + '\'' +
                ", userId='" + userId + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
