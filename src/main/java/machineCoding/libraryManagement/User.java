package machineCoding.libraryManagement;

import java.util.ArrayList;
import java.util.List;

class User {
    private String userId;
    private String name;
    private String email;
    private List<String> borrowedBooks;

    public User(String userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getUserId() {
        return userId;
    }

    public void borrowBook(String bookId) {
        borrowedBooks.add(bookId);
    }

    public void returnBook(String bookId) {
        borrowedBooks.remove(bookId);
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
