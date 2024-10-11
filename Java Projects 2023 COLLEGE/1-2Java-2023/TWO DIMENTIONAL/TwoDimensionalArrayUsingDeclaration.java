public class TwoDimensionalArrayUsingDeclaration {
    public static void main(String args[]) {
      int age[][] = new int[5][5]; //Two-dimensional array declaration
      //The first square bracket is for rows
      //The second square bracket is for columns
      //This means that there are five rows and in each rows there are 5 columns.
      
      //assigning value for two-dimensional array
      
      //row 1
      age[0][0] = 1;
      age[0][1] = 2;
      age[0][2] = 3;
      age[0][3] = 4;
      age[0][4] = 5;
      
      //row 2
      age[1][0] = 6;
      age[1][1] = 7;
      age[1][2] = 8;
      age[1][3] = 9;
      age[1][4] = 10;
      
      //row 3
      age[2][0] = 11;
      age[2][1] = 12;
      age[2][2] = 13;
      age[2][3] = 14;
      age[2][4] = 15;
      
      //row 4
      age[3][0] = 11;
      age[3][1] = 12;
      age[3][2] = 13;
      age[3][3] = 14;
      age[3][4] = 15;
      
      //row 5
      age[4][0] = 16;
      age[4][1] = 17;
      age[4][2] = 18;
      age[4][3] = 19;
      age[4][4] = 20;
      
      //displaying value for one-dimensional using loop
      System.out.println("One-dimensional array element display using FOR LOOP: ");
      for(int row = 0; row < age.length; row++){
          for(int col= 0; col < age[row].length; col++){
          System.out.println(age[row][col]);
      }
    }
    //displaying value for one-dimensional using individual display.
      System.out.println("One-dimensional array element display using INDIVIDUAL DISPLAY: ");
      System.out.println("Row 1: ");
      System.out.println(age[0][0]);
      System.out.println(age[0][1]);
      System.out.println(age[0][2]);
      System.out.println(age[0][3]);
      System.out.println(age[0][4]);
      
      System.out.println("Row 2: ");
      System.out.println(age[1][0]);
      System.out.println(age[1][1]);
      System.out.println(age[1][2]);
      System.out.println(age[1][3]);
      System.out.println(age[1][4]);
      
      System.out.println("Row 3: ");
      System.out.println(age[2][0]);
      System.out.println(age[2][1]);
      System.out.println(age[2][2]);
      System.out.println(age[2][3]);
      System.out.println(age[2][4]);
      
      System.out.println("Row 4: ");
      System.out.println(age[3][0]);
      System.out.println(age[3][1]);
      System.out.println(age[3][2]);
      System.out.println(age[3][3]);
      System.out.println(age[3][4]);
      
      System.out.println("Row 5: ");
      System.out.println(age[4][0]);
      System.out.println(age[4][1]);
      System.out.println(age[4][2]);
      System.out.println(age[4][3]);
      System.out.println(age[4][4]);

    }
}