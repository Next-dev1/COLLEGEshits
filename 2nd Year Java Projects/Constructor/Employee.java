public class Employee {
    int ID;
    String Name;
    String Department;

    public Employee(){
        this.ID = 0;
        this.Name = "Unknown";
        this.Department = "General";
    }

    public Employee(int ID, String Name, String Department){
        this.ID = ID;
        this.Name = Name;
        this.Department = Department;
    }

    public Employee(int ID, String Name){
        this.ID = ID;
        this.Name = Name;
        
    }

    public void display(){
        System.out.println("ID: " + this.ID + ", Name: " + this.Name + ", Department: " + this.Department);
    }

    public static void main (String [] args){
        Employee defaultEmployee = new Employee();
        System.out.println("Default Employee Details:");
        defaultEmployee.display();

        Employee specificEmployee = new Employee(101 , "Peter Ramirez" , "Engineering");
        System.out.println("\nSpecific Employee Details:");
        specificEmployee.display();
        
        Employee anotherEmployee = new Employee(102 , "John Santiago", "General");
        System.out.println("\nSquare Employee Details:");
        anotherEmployee.display();

    }
}

// Programmed by Sean Mandayo