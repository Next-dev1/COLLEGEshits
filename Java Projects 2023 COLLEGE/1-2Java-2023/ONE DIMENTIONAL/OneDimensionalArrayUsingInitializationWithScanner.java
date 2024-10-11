import java.util.Scanner;
public class OneDimensionalArrayUsingInitializationWithScanner {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Welcome to ONE DIMENSIONAL ARRAY USING INITIALIZATION with USER-INPUT. ");
    System.out.println("To start, please enter five of your favorite places. ");
    System.out.println("You can either enter a place you have never visit before or you have visted before. ");
    System.out.println("Enter places here: ");
    
    System.out.print("1. "); 
    String index0 = sc.nextLine(); //For index 0 placement in array
    
    System.out.print("2. ");
    String index1 = sc.nextLine(); //For index 1 placement in array
    
    System.out.print("3. ");
    String index2 = sc.nextLine(); //For index 2 placement in array
    
    System.out.print("4. ");
    String index3 = sc.nextLine(); //For index 3 placement in array
    
    System.out.print("5. ");
    String index4 = sc.nextLine(); //For index 4 placement in array
    
    //assign values in an array using INITIALIZATION
    String favoritePlaces[] = {index0, index1, index2, index3, index4};
    
    //displaying values in an array using FOR LOOP
    System.out.println("=============================================================");
    System.out.println("Listed below are the top five favorite places you entered: ");
    for(int indexNum = 0; indexNum < favoritePlaces.length; indexNum++){
        System.out.println(favoritePlaces[indexNum]);
    }
    
    //let us use the individual display to get a specific value
    System.out.println("=============================================================");
    System.out.println("Enter 0 - 4 to check which place will be displayed. ");
    System.out.print("Enter choice: ");
    int choiceNumber = sc.nextInt(); //We'll use this to manipulate the index number in the individual display
    
    if(choiceNumber < favoritePlaces.length && choiceNumber >= 0){ //This condition is to check if the user will only enter 0 - 4. 
    System.out.println("Saved place on this number is: " + favoritePlaces[choiceNumber]);
    }
    else{ //if the user entered less than 0 or more than 4 it is already out of range
        System.out.println("Number out of range. ");
    }
    }
}