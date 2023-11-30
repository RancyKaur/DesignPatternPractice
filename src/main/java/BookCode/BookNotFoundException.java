package BookCode;

public class BookNotFoundException extends Exception {
    public BookNotFoundException(String message) {
        super("Sorry the book not available in library: " + message);
    }
}
