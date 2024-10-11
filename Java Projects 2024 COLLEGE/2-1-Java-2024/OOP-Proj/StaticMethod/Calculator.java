class Math { 
    public static int add (int num1, int num2){
        return num1 + num2;
    }
    public static int subtract (int num1, int num2){
        return num1 - num2;
    }
    
}

public class Calculator {
    public static void main (String [] args){
        int sum = Math.add(10,20);
        int diff = Math.subtract(10,5);

        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + diff) ;
    }
}
//This is the example of static method in java.
//Programmed by Sean :>>