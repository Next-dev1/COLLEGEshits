import java.util.Scanner;
public class MultiDimensionalArrayUsingInitializationWithScanner {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Welcome to MULTI DIMENSIONAL ARRAY USING INITIALIZATION with USER-INPUT. ");
    System.out.println("To start, lets enter random numbers ");
    System.out.println("Enter numbers to SET 1 - ROW 1: ");
    System.out.print("1. ");
    int num000 = sc.nextInt();  //This is for set 1 - row 1 - first element
    
    System.out.print("2. ");
    int num001 = sc.nextInt(); //This is for set 1 - row 1 - second element
    
    System.out.print("3. ");
    int num002 = sc.nextInt(); //This is for set 1 - row 1 - third element
    
    System.out.print("4. ");
    int num003 = sc.nextInt(); //This is for set 1 - row 1 - fourth element
    
    System.out.print("5. ");
    int num004 = sc.nextInt(); //This is for set 1 - row 1 - fifth element
    
    System.out.println("Enter numbers to SET 1 - ROW 2: ");
    System.out.print("1. ");
    int num010 = sc.nextInt(); //This is for set 1 - row 2 - first element
    
    System.out.print("2. ");
    int num011 = sc.nextInt(); //This is for set 1 - row 2 - second element
    
    System.out.print("3. ");
    int num012 = sc.nextInt(); //This is for set 1 - row 2 - third element
    
    System.out.print("4. ");
    int num013 = sc.nextInt(); //This is for set 1 - row 2 - fourth element
    
    System.out.print("5. ");
    int num014 = sc.nextInt(); //This is for set 1 - row 1 - fifth element
    
    System.out.println("Enter numbers to SET 2 - ROW 1: ");
    System.out.print("1. ");
    int num100 = sc.nextInt(); //This is for set 2 - row 1 - first element
    
    System.out.print("2. ");
    int num101 = sc.nextInt(); //This is for set 2 - row 1 - second element
    
    System.out.print("3. ");
    int num102 = sc.nextInt(); //This is for set 2 - row 1 - third element
    
    System.out.print("4. ");
    int num103 = sc.nextInt(); //This is for set 2 - row 1 - fourth element
    
    System.out.print("5. ");
    int num104 = sc.nextInt(); //This is for set 2 - row 1 - fifth element
    
    System.out.println("Enter numbers to SET 2 - ROW 2: ");
    System.out.print("1. ");
    int num110 = sc.nextInt(); //This is for set 2 - row 2 - first element
    
    System.out.print("2. ");
    int num111 = sc.nextInt(); //This is for set 2 - row 2 - second element
    
    System.out.print("3. ");
    int num112 = sc.nextInt(); //This is for set 2 - row 2 - third element
    
    System.out.print("4. ");
    int num113 = sc.nextInt(); //This is for set 2 - row 2 - fourth element
    
    System.out.print("5. ");
    int num114 = sc.nextInt(); //This is for set 2 - row 2 - fifth element
    
    
    int age [][][] = { //ARRAY INITIALIZATION
      {
          {num000, num001, num002, num003, num004},
          {num010, num011, num012, num013, num014}
      }, 
      {
          {num100, num101, num102, num103, num104},
          {num110, num111, num112, num113, num114}
      }  
    };
     //displaying value for  multi-dimensional using loop
      System.out.println("Multi-dimensional array element display using FOR LOOP: ");
        for(int set = 0; set < age.length; set++){ //This is for the number of sets
           for(int row = 0; row < age[set].length; row++){ //This is for the number of rows in a set
            for(int col = 0; col < age[set][row].length; col++){ //This is for the number of columns in each row
                System.out.print(age[set][row][col]);
                System.out.print("\t");
            }
            System.out.println();
        }
        
      }
        //displaying value for multi-dimensional using individual display.
      System.out.println("Multi-dimensional array element display using INDIVIDUAL DISPLAY: ");
      //set 1 - row 1
      System.out.print(age[0][0][0]);
      System.out.print("\t");
      System.out.print(age[0][0][1]);
      System.out.print("\t");
      System.out.print(age[0][0][2]);
      System.out.print("\t");
      System.out.print(age[0][0][3]);
      System.out.print("\t");
      System.out.println(age[0][0][4]);
      System.out.println("----------------");
      //set 1 - row 2
      System.out.print(age[0][1][0]);
      System.out.print("\t");
      System.out.print(age[0][1][1]);
      System.out.print("\t");
      System.out.print(age[0][1][2]);
      System.out.print("\t");
      System.out.print(age[0][1][3]);
      System.out.print("\t");
      System.out.println(age[0][1][4]);
      System.out.println("-----------------");
      //set 2 - row 1
      System.out.print(age[1][0][0]);
      System.out.print("\t");
      System.out.print(age[1][0][1]);
      System.out.print("\t");
      System.out.print(age[1][0][2]);
      System.out.print("\t");
      System.out.print(age[1][0][3]);
      System.out.print("\t");
      System.out.println(age[1][0][4]);
      System.out.println("-----------------");
      //set 2 - row 2
      System.out.print(age[1][1][0]);
      System.out.print("\t");
      System.out.print(age[1][1][1]);
      System.out.print("\t");
      System.out.print(age[1][1][2]);
      System.out.print("\t");
      System.out.print(age[1][1][3]);
      System.out.print("\t");
      System.out.print(age[1][1][4]);
    }
}