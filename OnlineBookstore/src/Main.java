import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OnlineManager manager = new OnlineManager();
        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {
            System.out.println("Enter command (add, update_price, update_quantity, search, display, display_all, exit): ");
            command = scanner.nextLine();

            switch (command.toLowerCase()) {
                case "add":
                    System.out.print("Enter book ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter genre: ");
                    String genre = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = Double.parseDouble(scanner.nextLine());
                    System.out.print("Enter quantity: ");
                    int quantity = Integer.parseInt(scanner.nextLine());
                    manager.addBook(new Book(id, title, author, genre, price, quantity));
                    break;

                case "update_price":
                    System.out.print("Enter book ID: ");
                    id = scanner.nextLine();
                    System.out.print("Enter new price: ");
                    price = Double.parseDouble(scanner.nextLine());
                    manager.updateBookPrice(id, price);
                    break;

                case "update_quantity":
                    System.out.print("Enter book ID: ");
                    id = scanner.nextLine();
                    System.out.print("Enter new quantity: ");
                    quantity = Integer.parseInt(scanner.nextLine());
                    manager.updateBookQuantity(id, quantity);
                    break;

                case "search":
                    System.out.print("Search by (id/title/author/genre): ");
                    String searchType = scanner.nextLine();
                    switch (searchType.toLowerCase()) {
                        case "id":
                            System.out.print("Enter book ID: ");
                            id = scanner.nextLine();
                            manager.displayBook(id);
                            break;
                        case "title":
                            System.out.print("Enter title: ");
                            title = scanner.nextLine();
                            List<Book> booksByTitle = manager.searchBooksByTitle(title);
                            manager.displayBooks(booksByTitle);
                            break;
                        case "author":
                            System.out.print("Enter author: ");
                            author = scanner.nextLine();
                            List<Book> booksByAuthor = manager.searchBooksByAuthor(author);
                            manager.displayBooks(booksByAuthor);
                            break;
                        case "genre":
                            System.out.print("Enter genre: ");
                            genre = scanner.nextLine();
                            List<Book> booksByGenre = manager.searchBooksByGenre(genre);
                            manager.displayBooks(booksByGenre);
                            break;
                        default:
                            System.out.println("Invalid search type");
                    }
                    break;

                case "display":
                    System.out.print("Enter book ID to display: ");
                    id = scanner.nextLine();
                    manager.displayBook(id);
                    break;

                case "display_all":
                    manager.displayAllBooks();
                    break;

                case "exit":
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid command");
            }
        }
    }
}
