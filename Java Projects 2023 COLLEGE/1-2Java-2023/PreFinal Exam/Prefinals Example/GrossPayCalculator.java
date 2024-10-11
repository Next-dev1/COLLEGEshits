import java.util.Scanner;
public class GrossPayCalculator {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      
      String employeeName, choice;
      double rpH, nOfHrs, oT, basicPay;
        System.out.println("(F) Fulltime");
        System.out.println("(P) Parttime");
        System.out.print("Enter employee type: ");
        choice = sc.nextLine();
        System.out.print("Enter employee name: ");
        employeeName = sc.nextLine();
        
        if(choice.equalsIgnoreCase("F")){
            System.out.print("Enter basic pay: ");
            basicPay = sc.nextDouble();
            
            System.out.println("Employee Name: " + employeeName);
            System.out.println("Basic Pay: " + basicPay);
            System.out.println("---------------------------");
            System.out.println("Gross Pay: " + basicPay);
        }
        else if(choice.equalsIgnoreCase("P")){
            System.out.print("Enter rate per hour: ");
            rpH = sc.nextDouble();
            System.out.print("Enter number of hours worked: ");
            nOfHrs = sc.nextDouble();
            System.out.print("Enter overtime hours: ");
            oT = sc.nextDouble();
            
            System.out.print("Enter basic pay: ");
            basicPay = sc.nextDouble();
            
            System.out.println("Employee Name: " + employeeName);
            double overtimeComputation = oT * (rpH * 1.25);
            System.out.println("Basic Pay: " + basicPay);
            System.out.println("Overtime Pay: " + overtimeComputation);
            double grossPay = basicPay + overtimeComputation;
            System.out.println("---------------------------");
            System.out.println("Gross Pay: " + grossPay);

        }
      else {
          System.out.print("Please enter correct option.");
      }
    }
}