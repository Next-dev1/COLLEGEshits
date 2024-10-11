public class TwoDimensionalArrayUsingInitialization {
    public static void main(String args[]) {
      int age[][] = { //creating 5 rows and in each row have 5 elements
          {1, 2, 3, 4, 5},
          {6, 7, 8, 9, 10},
          {11, 12, 13, 14, 15},
          {16, 17, 18, 19, 20},
          {21, 22, 23, 24, 25}
      }; //Two-dimensional array using initialization. 
      
      //displaying one-dimensional array using FOR LOOP
      System.out.println("Two dimensional array display using FOR LOOP: ");
      for(int row = 0; row < age.length; row++){
          for(int col= 0; col < age[row].length; col++){
          System.out.println(age[row][col]);
      }
    }
      
      //displaying one-dimensional array using INDIVIDUAL DISPLAY
      System.out.println("Two dimensional array display using INDIVIDUAL DISPLAY: ");
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