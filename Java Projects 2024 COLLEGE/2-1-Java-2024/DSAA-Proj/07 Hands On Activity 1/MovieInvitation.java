import java.util.Scanner;
import java.util.PriorityQueue;

public class MovieInvitation {
    public static void main(String[] args) {
        PriorityQueue<String> movieList = new PriorityQueue<>();
        Scanner input = new Scanner(System.in);
        char watch;
        
        System.out.println("Enter the names of 4 movies you want to watch:");
        for (int i = 0; i < 4; i++) {
            String movie = input.nextLine();
            movieList.add(movie);
        }
        
        System.out.print("Press W to watch each movie in order. ");
        do {
            watch = input.next().charAt(0);
            if (watch == 'w') {
                System.out.println("Now watching: " + movieList.remove());
                
                if (movieList.isEmpty()) {
                    System.out.println("Finished all movies!");
                    break;
                }
            }
        } while (watch == 'w');
    }
}
