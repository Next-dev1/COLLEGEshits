import java.util.*;

public class PokemonGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("[Pokemon Game] ");
        System.out.println("1 - Play");
        System.out.println("2 - Exit");
        System.out.println("Press 1 to play or press 2 to exit...");
        int ch = s.nextInt();

        while(true){
        if(ch == 1){
        System.out.print("Enter trainers name: ");
        String p1 = s.nextLine();
        p1 = s.next();
        System.out.println("_____________________________________________________________________");
        System.out.println("Professor Samuel Oak: ");
        System.out.println(  "Welcome to the Pokémon Adventure Game, Trainer " + p1);
        System.out.println("In this game, you will become a Pokémon Trainer.");
        System.out.println("You will catch, train, and battle Pokémon to become a Pokémon Master!");
        System.out.println("Are you ready to embark on your journey?");
        System.out.println("_____________________________________________________________________");
        
        s.close();
    }

    else{
        System.out.println("Thank you...");
        System.out.println("See you next time, Training!");
        break;
        }

        }
    }
}