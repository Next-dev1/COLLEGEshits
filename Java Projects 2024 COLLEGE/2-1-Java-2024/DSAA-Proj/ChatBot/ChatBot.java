import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hi there! What's your name? ");
        String name = sc.nextLine();
        Thread.sleep(2000);
        System.out.println("Nice to meet you, " + name + "!");

        System.out.print("What's your favorite hobby? ");
        String hobby = sc.nextLine();
        Thread.sleep(2000);
        System.out.println("Wow, " + hobby + " sounds like so much fun!");

        System.out.print("What's your favorite food? ");
        String food = sc.nextLine();
        Thread.sleep(2000);
        System.out.println("Yum! I love " + food + " too!");

        ArrayList<String> activities = new ArrayList<>();
        activities.add("reading a book");
        activities.add("listening to music");
        activities.add("going for a walk");
        Collections.shuffle(activities);

        System.out.println("If you're free later, how about " + activities.get(0) + "? It might be a good way to unwind!");
    }
}
