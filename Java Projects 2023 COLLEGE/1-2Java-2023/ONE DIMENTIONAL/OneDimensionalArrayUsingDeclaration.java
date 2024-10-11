public class OneDimensionalArrayUsingDeclaration {
    public static void main(String args[]) {
      int age[] = new int[5]; //One-dimensional array declaration
      
      
      //assigning value for one-dimensional array
      age[0] = 17;
      age[1] = 25;
      age[2] = 18;
      age[3] = 20;
      age[4] = 27;
      
      //displaying value for one-dimensional using loop
      System.out.println("One-dimensional array element display using FOR LOOP: ");
      for(int indexNum = 0; indexNum < age.length; indexNum++){
          System.out.println(age[indexNum]);
      }
      
      //displaying value for one-dimensional using individual display.
      System.out.println("One-dimensional array element display using INDIVIDUAL DISPLAY: ");
      System.out.println(age[0]);
      System.out.println(age[1]);
      System.out.println(age[2]);
      System.out.println(age[3]);
      System.out.println(age[4]);
    }
}