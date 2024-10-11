public class Car {
    String make;
    String model;
    int year;

    public Car(){
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 0;
    }

    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Car(String make, String model){
        this.make = make;
        this.model = model;
        
    }

    public void display(){
        System.out.println("Make: " + this.make + ", Model: " + this.model + ", Year: " + this.year);
    }

    public static void main (String [] args){
        Car defaultCar = new Car();
        System.out.println("Default Car Details:");
        defaultCar.display();

        Car specificCar = new Car("Toyota" , "Camry", 2020);
        System.out.println("\nSpecific Car Details:");
        specificCar.display();
        
        Car anotherCar = new Car("Honda" , "Civic", 2023);
        System.out.println("\nAnother Car Details:");
        anotherCar.display();

    }
}

// Programmed by Sean Mandayo