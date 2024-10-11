public class Employee {
    // Private fields for encapsulation
    private int employeeId;
    private String name;
    private double salary;

    // Constructor
    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    // Getter for employeeId
    public int getEmployeeId() {
        return employeeId;
    }

    // Setter for employeeId
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to calculate bonus
    public double calculateBonus() {
        return salary * 0.10; // 10% bonus
    }

    public static void main(String[] args) {
        Employee e = new Employee(101, "John Doe", 50000);
        System.out.println("Employee ID: " + e.getEmployeeId());
        System.out.println("Employee Name: " + e.getName());
        System.out.println("Salary: " + e.getSalary());
        System.out.println("Bonus: " + e.calculateBonus());
    }
}
