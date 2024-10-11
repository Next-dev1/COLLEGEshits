import java.util.Scanner;

public class Grosspay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Press F for Full Time or P for Part Time: ");
        char employmentType = scanner.next().charAt(0);

       
        if (employmentType == 'F' || employmentType == 'f') {
           System.out.println("--- Full Time Employee ");
            System.out.print("Enter Basic Pay: ");
              double monthlySalary = scanner.nextDouble();
          
            System.out.println("___________________");
            
            System.out.println("Employee Name: " + employeeName);
            System.out.println("Basic Pay: " + monthlySalary);
            System.out.println("");
            
            System.out.println("___________________");
            System.out.println("Gross Pay: " + monthlySalary);
            
        } else if(employmentType == 'P' || employmentType == 'p') {
           System.out.println("--- Part Time Employee ---");
            System.out.print("Enter rate per hour: ");
              double hourlyWage = scanner.nextDouble();

            System.out.print("Enter no. of hours worked: ");
              double hoursWorked = scanner.nextDouble();

            System.out.print("Enter no. of overtime: ");
              double overtimeHours = scanner.nextDouble();
              System.out.println("");

               double overtimePay = overtimeHours * hourlyWage * 1.25;

              double totalWage = (hoursWorked * hourlyWage) + overtimePay;

       
             System.out.println("___________________");
             
             System.out.println("Employee Name: " + employeeName);
             System.out.println("Basic Pay: " + totalWage);
            System.out.println("Overtime Pay: " + overtimeHours);
            System.out.println("");
            System.out.println("___________________");
            
            System.out.println("Gross Pay: " + totalWage);
            
        } else {
                System.out.println("Error: Invalid input. Please enter F or P.");
   
        }
    }
}
