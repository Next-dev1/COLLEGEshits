import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Books {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> book = new Stack<>();
        Queue<String> bookTitle = new LinkedList<>();

        System.out.println("Enter four book titles ");
        System.out.println();
        for(int i = 0; i < 4; i++){
            System.out.print("Book " + (i == 0 ? "One" : i == 1 ? "Two" : i == 2 ? "Three" : "Four") + ": ");
            book.add(sc.nextLine());
            System.out.println();
        }


        System.out.println("New order of books: ");

        for(int i = 0; i < 4; i++){
            bookTitle.offer(book.pop());
        }
        System.out.println(bookTitle);
    }
}

//Programmed By Sean