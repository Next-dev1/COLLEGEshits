public class MultiDimensionalArrayUsingInitialization {
    public static void main(String args[]) {
      int age[][][] = {
            {
              {15, 20, 23, 18, 27}, //set 1 - row 1
              {1, 2, 3, 4, 5} //set 1 - row 2
            },
            {
              {8, 9, 10, 11, 12}, //set 2 - row 1
              {21, 22, 23, 24, 25} //set 2 - row 2
            }
          }; //Multi-dimensional array using initialization. 
          
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