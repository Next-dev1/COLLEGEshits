import java.util.Scanner;

abstract class LibraryItem {
    String itemId;
    boolean isBorrowed;

    LibraryItem(String itemId) {
        this.itemId = itemId;
        this.isBorrowed = false;
    }

    abstract String getItemDetails();

    String getItemType() {
        return this.getClass().getSimpleName();
    }

    boolean borrowItem() {
        if (isBorrowed) {
            return false; // Item is already borrowed
        }
        isBorrowed = true;
        return true; // Successfully borrowed
    }

    boolean returnItem() {
        if (!isBorrowed) {
            return false; // Item is not borrowed
        }
        isBorrowed = false;
        return true; // Successfully returned
    }
}

class Book extends LibraryItem {
    String title;
    String author;

    Book(String itemId, String title, String author) {
        super(itemId);
        this.title = title;
        this.author = author;
    }

    @Override
    String getItemDetails() {
        return "Book ID: " + itemId + "\nTitle: " + title + "\nAuthor: " + author + "\nBorrowed: " + isBorrowed;
    }
}

class Magazine extends LibraryItem {
    String title;
    int issueNumber;

    Magazine(String itemId, String title, int issueNumber) {
        super(itemId);
        this.title = title;
        this.issueNumber = issueNumber;
    }

    @Override
    String getItemDetails() {
        return "Magazine ID: " + itemId + "\nTitle: " + title + "\nIssue Number: " + issueNumber + "\nBorrowed: " + isBorrowed;
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LibraryItem book = new Book("101", "Java Programming", "James Gosling");
        LibraryItem magazine = new Magazine("202", "Tech Monthly", 15);

        while (true) {
            System.out.println("\nLibrary System");
            System.out.println("1. View Items");
            System.out.println("2. Borrow Item");
            System.out.println("3. Return Item");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("\nItem Type: " + book.getItemType());
                System.out.println(book.getItemDetails());
                System.out.println("\nItem Type: " + magazine.getItemType());
                System.out.println(magazine.getItemDetails());
            } else if (choice == 2) {
                System.out.print("\nEnter item ID to borrow: ");
                String itemId = scanner.next();
                if (itemId.equals(book.itemId)) {
                    if (book.borrowItem()) {
                        System.out.println("Book borrowed successfully.");
                    } else {
                        System.out.println("Book is already borrowed.");
                    }
                } else if (itemId.equals(magazine.itemId)) {
                    if (magazine.borrowItem()) {
                        System.out.println("Magazine borrowed successfully.");
                    } else {
                        System.out.println("Magazine is already borrowed.");
                    }
                } else {
                    System.out.println("Invalid item ID.");
                }
            } else if (choice == 3) {
                System.out.print("\nEnter item ID to return: ");
                String itemId = scanner.next();
                if (itemId.equals(book.itemId)) {
                    if (book.returnItem()) {
                        System.out.println("Book returned successfully.");
                    } else {
                        System.out.println("Book was not borrowed.");
                    }
                } else if (itemId.equals(magazine.itemId)) {
                    if (magazine.returnItem()) {
                        System.out.println("Magazine returned successfully.");
                    } else {
                        System.out.println("Magazine was not borrowed.");
                    }
                } else {
                    System.out.println("Invalid item ID.");
                }
            } else if (choice == 4) {
                System.out.println("Exiting the system. Goodbye!");
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
// Programmed by Sean -_-