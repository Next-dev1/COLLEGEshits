// Define the superclass Shape
abstract class Shape {
    // Abstract method to calculate area
    abstract public double getArea();
}

// Subclass of Shape for Rectangle
class Rectangle extends Shape {
    int length;
    int width;

    public Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    
    public double getArea() {
        return length * width;
    }
}

// Subclass of Shape for Circle
class Circle extends Shape {
    int radius;

    public Circle(int r) {
        radius = r;
    }

    
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Test class
public class LabExer3 {
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle r = new Rectangle(5, 10);
        System.out.println("Area of rectangle: " + r.getArea()); // 50.0

        // Create a Circle object
        Circle c = new Circle(5);
        System.out.println("Area of circle: " + c.getArea()); // 78.53981633974483
    }
}