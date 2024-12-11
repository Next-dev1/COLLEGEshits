public interface Shapes2 {
    public void calculateArea();
}

class Rectangle implements Shapes2 {
    int width;
    int length;

    @Override
    public void calculateArea() {
        double area = width * length;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Trianle implements Shapes2 {
    int base;
    int height;

    @Override
    public void calculateArea() {
        double area = 0.5 * (base * height);
        System.out.println("Area of Triangle: " + area);

    }
    
}

class Circle implements Shapes2 {
    double radius;
    final double pi = 3.14;
    
    @Override
    public void calculateArea() {
        double area = pi * (radius * radius);
        System.out.printf("Area of Circle: %.2f" , area);

    }
    
}
