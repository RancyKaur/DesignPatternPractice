package BookCode;
import java.util.ArrayList;
import java.util.List;
 public class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public void borrow() throws BookAlreadyBorrowedException {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed: " + title);
        } else {
            throw new BookAlreadyBorrowedException(title);
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("Book returned: " + title);
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}

