public class OneDimensionalArrayUsingInitialization {
    public static void main(String args[]) {
      int age[] = {15, 20, 23, 18, 27}; //One-dimensional array using initialization. 
      
      //displaying one-dimensional array using FOR LOOP
      System.out.println("One dimensional array display using FOR LOOP: ");
      for(int indexNum = 0; indexNum < age.length; indexNum++){
          System.out.println(age[indexNum]);
      }
      
      //displaying one-dimensional array using INDIVIDUAL DISPLAY
      System.out.println("One dimensional array display using INDIVIDUAL DISPLAY: ");
      System.out.println(age[0]);
      System.out.println(age[1]);
      System.out.println(age[2]);
      System.out.println(age[3]);
      System.out.println(age[4]);
    }
}