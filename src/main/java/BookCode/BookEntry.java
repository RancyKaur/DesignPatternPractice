package BookCode;
import java.util.ArrayList;
import java.util.List;

public class BookEntry {

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("The Alchemist", "Paulo Coelho"));
        library.addBook(new Book("1984", "George Orwell"));

        // Borrowing and returning books
        try
        {
                Book book = library.findBook("The Alchemist");
                if (book != null) {
                    book.borrow();
                }

                // Attempting to borrow a book that doesn't exist
                Book nonExistingBook = library.findBook("Brave New World");
                if (nonExistingBook != null) {
                    nonExistingBook.borrow();
                }

                // Returning the borrowed book
                if (book != null) {
                    book.returnBook();
                }

                book = library.findBook("The Alchemist");
                if (book != null) {
                    book.borrow();
                }

                // Attempting to borrow a book that doesn't exist
                nonExistingBook = library.findBook("Brave New World");
                if (nonExistingBook != null) {
                    nonExistingBook.borrow();
                }

                // Returning the borrowed book
                if (book != null) {
                    book.returnBook();
                }
        }
        catch (BookNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        catch (BookAlreadyBorrowedException e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("Done");
        }
    }
}
