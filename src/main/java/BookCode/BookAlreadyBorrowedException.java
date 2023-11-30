package BookCode;

public class BookAlreadyBorrowedException extends Exception {
    public BookAlreadyBorrowedException(String message) {
        super("Sorry the book already borrowed: " + message);
    }
}
