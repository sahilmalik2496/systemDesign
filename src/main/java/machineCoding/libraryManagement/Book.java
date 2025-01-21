package machineCoding.libraryManagement;

class Book {
    private String bookId;
    private String title;
    private String author;
    private String genre;
    private String ISBN;
    private boolean isAvailable;

    public Book(String bookId, String title, String author, String genre, String ISBN) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.ISBN = ISBN;
        this.isAvailable = true;
    }

    public String getBookId() {
        return bookId;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + bookId + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

