import java.util.Scanner;

abstract class Employee {
    String employeeId;
    String name;

    Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    abstract double calculateBonus();
    abstract double calculateBenefits();
}

class Manager extends Employee {
    Manager(String employeeId, String name) {
        super(employeeId, name);
    }

    @Override
    double calculateBonus() {
        return 1600.0;
    }

    @Override
    double calculateBenefits() {
        return 1000.0;
    }
}

class Developer extends Employee {
    Developer(String employeeId, String name) {
        super(employeeId, name);
    }

    @Override
    double calculateBonus() {
        return 600.0;
    }

    @Override
    double calculateBenefits() {
        return 500.0;
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Employee System");
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Manager");
            System.out.println("2. Add Developer");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            if (choice == 3) {
                System.out.println("Exiting the system. Goodbye!");
                break;
            }

            System.out.print("Enter Employee ID: ");
            String employeeId = scanner.nextLine();
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            Employee employee;
            if (choice == 1) {
                employee = new Manager(employeeId, name);
            } else if (choice == 2) {
                employee = new Developer(employeeId, name);
            } else {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            System.out.println("\nEmployee Details:");
            System.out.println("Employee ID: " + employee.employeeId);
            System.out.println("Name: " + employee.name);
            System.out.println("Bonus: " + employee.calculateBonus() + " PHP");
            System.out.println("Benefits: " + employee.calculateBenefits() + " PHP");
        }

        scanner.close();
    }
}
// Programmed by Sean -_-