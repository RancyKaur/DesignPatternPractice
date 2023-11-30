package BookCode;

import java.util.ArrayList;
import java.util.List;

public class Library  {
    private List<Book> books;

    public Library() {
        books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public Book findBook(String title) throws BookNotFoundException {
        boolean bookNotFound = true;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        if(bookNotFound) {
            throw new BookNotFoundException(title);
        }
        return null;
    }
}


