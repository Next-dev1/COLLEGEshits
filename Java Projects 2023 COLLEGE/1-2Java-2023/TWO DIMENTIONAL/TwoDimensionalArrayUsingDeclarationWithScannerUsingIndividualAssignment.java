import java.util.Scanner;
public class TwoDimensionalArrayUsingDeclarationWithScannerUsingIndividualAssignment {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Welcome to TWO DIMENSIONAL ARRAY USING DECLARATION with USER-INPUT. ");
    System.out.println("To start, please enter ten of your favorite games. ");
    
    String favoriteGames[][] = new String[2][5];
    //using FOR LOOP for user input
   System.out.println("Enter games you have played before: ");
    System.out.print("1. ");
    favoriteGames[0][0] = sc.nextLine(); //This is assigning user input in index 0 - ROW 1
    
    System.out.print("2. ");
    favoriteGames[0][1] = sc.nextLine(); //This is assigning user input in index 1 - ROW 1
    
    System.out.print("3. ");
    favoriteGames[0][2] = sc.nextLine(); //This is assigning user input in index 2 - ROW 1
    
    System.out.print("4. ");
    favoriteGames[0][3] = sc.nextLine(); //This is assigning user input in index 3 - ROW 1
    
    System.out.print("5. ");
    favoriteGames[0][4] = sc.nextLine(); //This is assigning user input in index 4 - ROW 1
    
    System.out.println("Enter games you want to play: ");
    System.out.print("1. ");
    favoriteGames[1][0] = sc.nextLine(); //This is assigning user input in index 0 - ROW 2
    
    System.out.print("2. ");
    favoriteGames[1][1] = sc.nextLine(); //This is assigning user input in index 1 - ROW 2
    
    System.out.print("3. ");
    favoriteGames[1][2] = sc.nextLine(); //This is assigning user input in index 2 - ROW 2
    
    System.out.print("4. ");
    favoriteGames[1][3] = sc.nextLine(); //This is assigning user input in index 3 - ROW 2
    
    System.out.print("5. ");
    favoriteGames[1][4] = sc.nextLine(); //This is assigning user input in index 4 - ROW 2
    
    System.out.println("Here are the list of games entered in the two dimensional array. "); //This is using for loop for displaying array elements.
    for(int row = 0; row < favoriteGames.length; row++){
        for(int col = 0; col < favoriteGames[row].length; col++){
        System.out.println(favoriteGames[row][col]);
        }
    }
     
     //Let us call individual index number values
    System.out.println("=============================================================");
    System.out.println("Enter row 0 - 1 to check which place will be displayed. ");
    int rowNum = sc.nextInt(); //We'll use this to manipulate the index number in the individual display
    System.out.print("Enter column 0 - 4 to check which place will be displayed. ");
    int colNum = sc.nextInt(); //We'll use this to manipulate the index number in the individual display
    if(rowNum < favoriteGames.length && colNum < favoriteGames[rowNum].length){ //This condition is to check if the user will only enter 0 - 4 for columns and 0 - 1 for rows. 
    System.out.println("Saved game on this number is: " + favoriteGames[rowNum][colNum]);
        }
    else{ //if the user entered less than 0 or more than 4 it is already out of range for rows and columns
        System.out.println("Number out of range. ");
        }
    
    }
}