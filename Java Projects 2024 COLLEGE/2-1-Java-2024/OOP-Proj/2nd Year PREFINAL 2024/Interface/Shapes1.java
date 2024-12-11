import java.util.Scanner;

public abstract class Shapes1 {
    
    public abstract void calculateArea();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        Circle c = new Circle();
        
        
        System.out.println("Enter width and length to calculate the area of a Square");
        System.out.print("Width: ");
        r.width = sc.nextInt();
        System.out.print("Length: ");
        r.length = sc.nextInt();
        r.calculateArea();

        System.out.println();

        System.out.println("Enter base and height to calculate the area of a Triangle");
        System.out.print("Base: ");
        t.base = sc.nextInt();
        System.out.print("Height: ");
        t.height = sc.nextInt();
        t.calculateArea();

        System.out.println();

        System.out.println("Enter the radius to calculate the area of a Circle");
        System.out.print("Radius: ");
        c.radius = sc.nextDouble();
        c.calculateArea();
        
        
        
    }
}

class Rectangle extends Shapes1 {
    int width;
    int length;

    
    public void calculateArea() {
        double area = width * length;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shapes1 {
    int base;
    int height;

    
    public void calculateArea() {
        double area = 0.5 * (base * height);
        System.out.println("Area of Triangle: " + area);

    }

}

class Circle extends Shapes1 {
    double radius;
    final double pi = 3.14;
    
    public void calculateArea() {
        double area = pi * (radius * radius);
        System.out.printf("Area of Circle: %.2f" , area);

    }

}

