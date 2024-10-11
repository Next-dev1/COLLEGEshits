import java.util.Scanner;
public class OneDimensionalArrayUsingDeclarationWithScannerUsingForLoop {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Welcome to ONE DIMENSIONAL ARRAY USING DECLARATION with USER-INPUT. ");
    System.out.println("To start, please enter five of your favorite anime characters. ");
    System.out.println("Enter characters here: ");
    
    String favoriteCharacters[] = new String[5];
    //using FOR LOOP for user input
   
        for(int indexNumber = 0; indexNumber < favoriteCharacters.length; indexNumber++){ //This is to allow user input for five elements in the array
            System.out.print(indexNumber + 1 + ". "); //This is for listing only.
            favoriteCharacters[indexNumber] = sc.nextLine();
            
        }
        
    System.out.println("Here are the list of anime characters entered in the one dimensional array. "); //This is using for loop for displaying array elements.
    for(int indexNum = 0; indexNum < favoriteCharacters.length; indexNum++){
        System.out.println(favoriteCharacters[indexNum]);
        }
     
     //Let us call individual index number values
     System.out.println("Enter 0 - 4 to check which character have you chosen from the list. ");
     System.out.print("Enter choice: ");
     int choiceNumber = sc.nextInt(); //This is for choosing index number in array.
        if(choiceNumber >= 0 && choiceNumber < favoriteCharacters.length){ //The number entered should only be 0 - 4
            System.out.print("You have chosen: " + choiceNumber + ". Your character is " + favoriteCharacters[choiceNumber]); //display of specific index number chosen
        }
        else { //If the index number entered is less than 0 and more than 4
        System.out.print("Out of range. ");
        }
    }
}