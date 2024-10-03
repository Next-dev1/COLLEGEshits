public class Rectangle {
    double length;
    double width;
    double area;

    public Rectangle(){
        this.length = 1.0;
        this.width = 1.0;
        this.area = calculateArea();
    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
        this.area = calculateArea();
    }

    private double calculateArea() {
        return this.length * this.width;
    }

    public void display(){
        System.out.println("Length: " + this.length + ", Width: " + this.width + ", Area: " + this.area);
    }

    public static void main (String [] args){
        Rectangle defaultRectangle = new Rectangle();
        System.out.println("Default Rectangle:");
        defaultRectangle.display();

        Rectangle specificRectangle = new Rectangle(5.0, 3.0);
        System.out.println("\nSpecific Rectangle:");
        specificRectangle.display();
        
        Rectangle anotherRectangle = new Rectangle(4.0, 4.0);
        System.out.println("\nSquare Rectangle:");
        anotherRectangle.display();

    }
}