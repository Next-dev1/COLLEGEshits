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
        System.out.println("You will battle Pokémon to become a Pokémon Master!");
        System.out.println("_____________________________________________________________________");
        System.out.println("Press enter to continue...");
        s.nextLine();
        s.nextLine();
        System.out.println("Professor Samuel Oak: Choose your Pokémon... ");
        System.out.println("1 - Pikachu");
        System.out.println("2 - Charmander");
        System.out.println("3 - Squirtle");
        System.out.println("Press the number to choose your favorite Pokemon");
        int pokemon = s.nextInt(); 

        if (pokemon == 1){
           Pikachu p = new Pikachu();
           p.displayFight();
        }
        else if (pokemon == 2){
            Charmander c = new Charmander();
            c.displayFight();
        }
        else if (pokemon == 3){
            Squirtle sq = new Squirtle();
            sq.displayFight();
        }
        else{
            System.out.println("Invalid option. Please choose a number between 1 and 3.");
        }
    }

    else{
        System.out.println("Thank you...");
        System.out.println("See you next time, Training!");
        break;
        }

        }
    }
}
class Pikachu{
    public void displayFight(){

    }
}

class Charmander{
    public void displayFight(){
        
    }
}

class Squirtle{
    public void displayFight(){
        
    }
}