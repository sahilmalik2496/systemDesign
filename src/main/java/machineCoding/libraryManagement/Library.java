package machineCoding.libraryManagement;

import java.util.*;

class Library {
    private Map<String, Book> books;
    private Map<String, User> users;
    private List<Transaction> transactions;

    public Library() {
        this.books = new HashMap<>();
        this.users = new HashMap<>();
        this.transactions = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.put(book.getBookId(), book);
    }

    public void registerUser(User user) {
        users.put(user.getUserId(), user);
    }

    public void borrowBook(String bookId, String userId) {
        if (!books.containsKey(bookId) || !users.containsKey(userId)) {
            System.out.println("Invalid book or user ID.");
            return;
        }

        Book book = books.get(bookId);
        if (!book.isAvailable()) {
            System.out.println("Book is not available.");
            return;
        }

        User user = users.get(userId);
        book.setAvailable(false);
        user.borrowBook(bookId);

        Transaction transaction = new Transaction(UUID.randomUUID().toString(), bookId, userId, "borrow", new Date());
        transactions.add(transaction);

        System.out.println("Book borrowed successfully.");
    }

    public void returnBook(String bookId, String userId) {
        if (!books.containsKey(bookId) || !users.containsKey(userId)) {
            System.out.println("Invalid book or user ID.");
            return;
        }

        Book book = books.get(bookId);
        User user = users.get(userId);
        book.setAvailable(true);
        user.returnBook(bookId);

        Transaction transaction = new Transaction(UUID.randomUUID().toString(), bookId, userId, "return", new Date());
        transactions.add(transaction);

        System.out.println("Book returned successfully.");
    }
}
