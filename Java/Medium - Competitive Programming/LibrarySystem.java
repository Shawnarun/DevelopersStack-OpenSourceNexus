
/*
 * Author : Priyandhini
 * Email : priyandhinip@gmail.com
 * Date : 6 March 2024
 * Description :In this Library System include adding books, displaying available books, borrowing books, 
 *              and returning books. The main program provides a simple text-based menu for interacting with the library system.
 */









import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        }
        System.out.println();
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isAvailable()) {
                System.out.println("You have borrowed: " + book.getTitle());
                book.setAvailable(false);
                return;
            }
        }
        System.out.println("Book not available for borrowing.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isAvailable()) {
                System.out.println("You have returned: " + book.getTitle());
                book.setAvailable(true);
                return;
            }
        }
        System.out.println("Invalid book return. Check the book title or it may not be borrowed.");
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();
        try (Scanner scanner = new Scanner(System.in)) {
            // Adding initial books to the library
            library.addBook(new Book("The Catcher in the Rye", "J.D. Salinger"));
            library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
            library.addBook(new Book("1984", "George Orwell"));

            while (true) {
                System.out.println("Library System Menu:");
                System.out.println("1. Display Available Books");
                System.out.println("2. Borrow a Book");
                System.out.println("3. Return a Book");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (choice) {
                    case 1:
                        library.displayBooks();
                        break;
                    case 2:
                        System.out.print("Enter the title of the book you want to borrow: ");
                        String borrowTitle = scanner.nextLine();
                        library.borrowBook(borrowTitle);
                        break;
                    case 3:
                        System.out.print("Enter the title of the book you want to return: ");
                        String returnTitle = scanner.nextLine();
                        library.returnBook(returnTitle);
                        break;
                    case 4:
                        System.out.println("Exiting Library System. Goodbye!");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            }
        }
    }
}
