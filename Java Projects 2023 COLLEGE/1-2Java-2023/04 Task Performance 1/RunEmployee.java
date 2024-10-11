import java.util.Scanner;

class Employee {
    private String name;
    private double ratePerHour;
    private int hoursWorked;
    private int daysOfWork;

    public Employee(String name, double ratePerHour, int hoursWorked, int daysOfWork) {
        this.name = name;
        this.ratePerHour = ratePerHour;
        this.hoursWorked = hoursWorked;
        this.daysOfWork = daysOfWork;
    }

    public double calculateWage() {
        return ratePerHour * hoursWorked;
    }

    public double getMonthlySalary() {
        return ratePerHour * daysOfWork;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getDaysOfWork() {
        return daysOfWork;
    }

    public void setDaysOfWork(int daysOfWork) {
        this.daysOfWork = daysOfWork;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Press F for Full Time or P for Part Time: ");
        char ch = sc.next().charAt(0);

        if (ch == 'P') {
            System.out.println("Enter rate per hour and no of hours worked separated by space: ");
            double ratePerHour = sc.nextDouble();
            int hoursWorked = sc.nextInt();
            int daysOfWork = (int) Math.ceil((double) hoursWorked / 8);

            Employee e = new Employee(name, ratePerHour, hoursWorked, daysOfWork);

            System.out.println("Name: " + e.getName());
            System.out.println("Wage: " + e.calculateWage());
            System.out.println("Days of Work: " + e.getDaysOfWork());
        } else if (ch == 'F') {
            System.out.println("Enter monthly salary: ");
            double monthlySalary = sc.nextDouble();
            int daysOfWork = 22; // Assuming a full-time employee works 22 days a month

            Employee e = new Employee(name, monthlySalary / daysOfWork, 0, daysOfWork);

            System.out.println("Name: " + e.getName());
            System.out.println("Monthly Salary: " + e.getMonthlySalary());
            System.out.println("Days of Work: " + e.getDaysOfWork());
        } else {
            System.out.println("Enter only F or P.");
        }
    }
}