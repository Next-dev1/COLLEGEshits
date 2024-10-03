public class Book {
    String title;
    String author;
    int year;

    public Book(){
        this.title = "Untitled";
        this.author = "Unknown";
        this.year = 0;
    }

    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        
    }

    public void displayBookDetails(){
        System.out.println("Title: " + this.title + ", Author: " + this.author + ", Year: " + this.year);
    }

    public static void main (String [] args){
        Book defaultBook = new Book();
        System.out.println("Default Book Details:");
        defaultBook.displayBookDetails();

        Book specificBook = new Book("1984" , "George Orwell", 1949);
        System.out.println("\nSpecific Book Details:");
        specificBook.displayBookDetails();
        
        Book anotherBook = new Book("To Kill a Mockingbird" , "Harper Lee", 2023);
        System.out.println("\nAnother Book Details:");
        anotherBook.displayBookDetails();

    }
}

// Programmed by Sean Mandayo