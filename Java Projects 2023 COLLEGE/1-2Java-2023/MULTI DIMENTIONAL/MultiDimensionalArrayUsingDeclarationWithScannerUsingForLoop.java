import java.util.Scanner;
public class MultiDimensionalArrayUsingDeclarationWithScannerUsingForLoop {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Welcome to MULTI DIMENSIONAL ARRAY USING DECLARATION with USER-INPUT. ");
    
    int age[][][] = new int[2][2][5];
    //using FOR LOOP for user input
   
        System.out.println("Multi-dimensional array element input using FOR LOOP: ");
        for(int set = 0; set < age.length; set++){ //This is for the number of sets
            System.out.print("Set: " + (set + 1) + " - ");
           for(int row = 0; row < age[set].length; row++){ //This is for the number of rows in a set
           System.out.println("Row: " + (row + 1));
            for(int col = 0; col < age[set][row].length; col++){ //This is for the number of columns in each row
                System.out.print(col + 1 + ". ");
                age[set][row][col] = sc.nextInt();
            }
        }
        
      }
      
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