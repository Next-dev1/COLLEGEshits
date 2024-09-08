class MathOperation {
    public int mul (int a, int b) {
        return a * b;
    }
    public int mul (int a, int b, int c) {
        return a * b * c;
    }
    public double mul (double a, double b) {
        return a * b;
    }
    public double mul (double a, double b, double c) {
        return a * b * c;
    }
    public float mul (float a, float b) {
        return a * b;
    }
    public float mul (float a, float b, float c) {
        return a * b * c;
    }
}

public class Multiply {
    public static void main (String [] args){
        MathOperation obj = new MathOperation ();

        
        System.out.println("Multiply: " + obj.mul(10, 20));
        System.out.println("Multiply: " + obj.mul(10, 20, 30));

        System.out.println("Multiply: " + obj.mul(10.5, 20.5));
        System.out.println("Multiply: " + obj.mul(10.5, 20.5, 30.5));

        System.out.println("Multiply: " + obj.mul(45.5f, 45,5f));
        System.out.println("Multiply: " + obj.mul(45.5f, 45.5f, 55.5f));
        
    }
}
