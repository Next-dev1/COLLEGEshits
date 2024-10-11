import java.util.Scanner;
public class TwoDimensionalArrayUsingDeclarationWithScannerUsingForLoop {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Welcome to TWO DIMENSIONAL ARRAY USING DECLARATION with USER-INPUT. ");
    System.out.println("To start, please enter ten of your favorite anime characters. ");
    System.out.println("Enter characters here: ");
    
    String favoriteCharacters[][] = new String[2][5];
    //using FOR LOOP for user input
   
        for(int rows = 0; rows < favoriteCharacters.length; rows++){ //This is to allow user input for two rows with five elements each.
            for(int cols = 0; cols < favoriteCharacters[rows].length; cols++){
            System.out.print(cols + 1 + ". "); //This is for listing only.
            favoriteCharacters[rows][cols] = sc.nextLine();
            }
        }
        
    System.out.println("Here are the list of anime characters entered in the two dimensional array. "); //This is using for loop for displaying array elements.
        for(int row = 0; row < favoriteCharacters.length; row++){ //This is to allow user input for two rows with five elements each.
            for(int col = 0; col < favoriteCharacters[row].length; col++){
            System.out.println(favoriteCharacters[row][col]); //This is for listing only.
            
            }
        }
     
     //Let us call individual index number values
    System.out.println("=============================================================");
    System.out.println("Enter row 0 - 1 to check which place will be displayed. ");
    int rowNum = sc.nextInt(); //We'll use this to manipulate the index number in the individual display
    System.out.print("Enter column 0 - 4 to check which place will be displayed. ");
    int colNum = sc.nextInt(); //We'll use this to manipulate the index number in the individual display
    if(rowNum < favoriteCharacters.length && colNum < favoriteCharacters[rowNum].length){ //This condition is to check if the user will only enter 0 - 4 for columns and 0 - 1 for rows. 
    System.out.println("Saved character on this number is: " + favoriteCharacters[rowNum][colNum]);
        }
    else{ //if the user entered less than 0 or more than 4 it is already out of range for rows and columns
        System.out.println("Number out of range. ");
        }
    }
}