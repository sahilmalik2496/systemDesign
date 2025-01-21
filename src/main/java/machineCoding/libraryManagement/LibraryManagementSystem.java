package machineCoding.libraryManagement;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books
        library.addBook(new Book("1", "Book One", "Author A", "Fiction", "123456"));
        library.addBook(new Book("2", "Book Two", "Author B", "Non-Fiction", "789101"));

        // Register users
        library.registerUser(new User("U1", "Alice", "alice@example.com"));
        library.registerUser(new User("U2", "Bob", "bob@example.com"));

        // Borrow and return operations
        library.borrowBook("1", "U1");
        library.returnBook("1", "U1");
    }
}
