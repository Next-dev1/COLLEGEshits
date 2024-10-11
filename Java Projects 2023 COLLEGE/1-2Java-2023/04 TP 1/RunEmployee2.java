import java.util.Scanner;

class Employee2 {

    private String name;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }  
}

class PartTimeEmployee2 extends Employee2 {
    public double ratePerHour;
    public double wage;
    public int hoursWorked;

    public void setWage(double ratePerHour, int hoursWorked){
        this.ratePerHour = ratePerHour;
        this.hoursWorked = hoursWorked;
    }

    public double getWage(){
        return wage = ratePerHour * hoursWorked;
    }
}

class FullTimeEmployee2 extends Employee2 {
    public double monthlySalary;
    

    public void setMonthlySalary(double monthlySalary){
        this.monthlySalary = monthlySalary;
        
    }

    public double getMonthlySalary(){
        return monthlySalary;
    }
}

    public class RunEmployee2 { 
        public static void main(String [] args){

            Scanner sc = new Scanner (System.in);

            System.out.println("Name: ");
            String name = sc.next();

            System.out.println("Enter F for Full Time or P for Part Time: ");
            char ch = sc.next().charAt(0);

            if (ch == 'P'){

                System.out.println("Enter rate per hour and no hours worked separted by space: ");
                double rh = sc.nextDouble();
                int hw = sc.nextInt();

                PartTimeEmployee2 e = new PartTimeEmployee2();
                e.setName(name);
                e.setWage(rh, hw);

                System.out.println("Employee: " + e.getName());
                System.out.println("Wage: " + e.getWage());


            }
            else if (ch == 'F'){

                System.out.println("Enter Monthly Salary: ");
                double ms = sc.nextDouble();
                

                FullTimeEmployee2 e = new FullTimeEmployee2();
                e.setName(name);
                e.setMonthlySalary(ms);

                System.out.println("Employee: " + e.getName());
                System.out.println("Monthly Salary: " + e.getMonthlySalary());
            }
            else {
                System.out.println("Enter F or P only");
            }
            
        }

    }


