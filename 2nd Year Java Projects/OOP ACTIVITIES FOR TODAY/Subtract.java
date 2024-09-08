class MathOperations {
    public int sub (int a, int b) {
        return a - b;
    }
    public int sub (int a, int b, int c) {
        return a - b - c;
    }
    public double sub (double a, double b) {
        return a - b;
    }
    public double sub (double a, double b, double c) {
        return a - b - c;
    }
    public float sub (float a, float b) {
        return a - b;
    }
    public float sub (float a, float b, float c) {
        return a - b - c;
    }
}

public class Subtract {
    public static void main (String [] args){
        MathOperations obj = new MathOperations ();

        
        System.out.println("Subtracted: " + obj.sub(10, 20));
        System.out.println("Subtracted: " + obj.sub(10, 20, 30));

        System.out.println("Subtracted: " + obj.sub(10.5, 20.5));
        System.out.println("Subtracted: " + obj.sub(10.5, 20.5, 30.5));

        System.out.println("Subtracted: " + obj.sub(45.5f, 45,5f));
        System.out.println("Subtracted: " + obj.sub(45.5f, 45.5f, 55.5f));
        
    }
}
