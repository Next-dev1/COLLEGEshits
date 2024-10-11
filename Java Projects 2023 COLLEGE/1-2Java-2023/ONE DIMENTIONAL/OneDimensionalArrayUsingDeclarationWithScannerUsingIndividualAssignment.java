import java.util.Scanner;
public class OneDimensionalArrayUsingDeclarationWithScannerUsingIndividualAssignment {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Welcome to ONE DIMENSIONAL ARRAY USING DECLARATION with USER-INPUT. ");
    System.out.println("To start, please enter five of your favorite games. ");
    System.out.println("Enter characters here: ");
    
    String favoriteGames[] = new String[5];
    //using FOR LOOP for user input
   
    System.out.print("1. ");
    favoriteGames[0] = sc.nextLine(); //This is assigning user input in index 0
    
    System.out.print("2. ");
    favoriteGames[1] = sc.nextLine(); //This is assigning user input in index 1
    
    System.out.print("3. ");
    favoriteGames[2] = sc.nextLine(); //This is assigning user input in index 2
    
    System.out.print("4. ");
    favoriteGames[3] = sc.nextLine(); //This is assigning user input in index 3
    
    System.out.print("5. ");
    favoriteGames[4] = sc.nextLine(); //This is assigning user input in index 4
        
    System.out.println("Here are the list of anime characters entered in the one dimensional array. "); //This is using for loop for displaying array elements.
    for(int indexNum = 0; indexNum < favoriteGames.length; indexNum++){
        System.out.println(favoriteGames[indexNum]);
    }
     
     //Let us call individual index number values
     System.out.println("Enter 0 - 4 to check which game have you chosen from the list. ");
     System.out.print("Enter choice: ");
     int choiceNumber = sc.nextInt(); //This is for choosing index number in array.
        if(choiceNumber >= 0 && choiceNumber < favoriteGames.length){ //The number entered should only be 0 - 4
            System.out.print("You have chosen: " + choiceNumber + ". Your game is " + favoriteGames[choiceNumber]); //display of specific index number chosen
        }
        else { //If the index number entered is less than 0 and more than 4
        System.out.print("Out of range. ");
        }
    }
}