public class MultiDimensionalArrayUsingDeclaration {
    public static void main(String args[]) {
      int age[][][] = new int[2][2][5]; //One-dimensional array declaration
      
      
      //assigning value for multi-dimensional array
      //set 1 //row 1
      age[0][0][0] = 1;
      age[0][0][1] = 2;
      age[0][0][2] = 3;
      age[0][0][3] = 4;
      age[0][0][4] = 5;
      
      //set 1 //row 2
      age[0][1][0] = 6;
      age[0][1][1] = 7;
      age[0][1][2] = 8;
      age[0][1][3] = 9;
      age[0][1][4] = 10;
      
      //set 2 //row 1
      age[1][0][0] = 11;
      age[1][0][1] = 12;
      age[1][0][2] = 13;
      age[1][0][3] = 14;
      age[1][0][4] = 15;
      
      //set 2 //row 2
      age[1][1][0] = 16;
      age[1][1][1] = 17;
      age[1][1][2] = 18;
      age[1][1][3] = 19;
      age[1][1][4] = 20;
   
      
      //displaying value for multi-dimensional using loop
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