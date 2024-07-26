import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OnlineManager {
    private List<Book> books;

    public OnlineManager() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void updateBookPrice(String bookId, double newPrice) {
        Book book = searchBookById(bookId);
        if (book != null) {
            book.setPrice(newPrice);
        } else {
            System.out.println("Book not found");
        }
    }

    public void updateBookQuantity(String bookId, int newQuantity) {
        Book book = searchBookById(bookId);
        if (book != null) {
            book.setQuantity(newQuantity);
        } else {
            System.out.println("Book not found");
        }
    }

    public Book searchBookById(String bookId) {
        return books.stream()
                .filter(book -> book.getBookId().equals(bookId))
                .findFirst()
                .orElse(null);
    }

    public List<Book> searchBooksByTitle(String title) {
        return books.stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(title))
                .collect(Collectors.toList());
    }

    public List<Book> searchBooksByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }

    public List<Book> searchBooksByGenre(String genre) {
        return books.stream()
                .filter(book -> book.getGenre().equalsIgnoreCase(genre))
                .collect(Collectors.toList());
    }

    public void displayBook(String bookId) {
        Book book = searchBookById(bookId);
        if (book != null) {
            System.out.println(book);
        } else {
            System.out.println("Book not found");
        }
    }

    public void displayBooks(List<Book> bookList) {
        bookList.forEach(System.out::println);
    }

    public void displayAllBooks() {
        displayBooks(books);
    }
}
