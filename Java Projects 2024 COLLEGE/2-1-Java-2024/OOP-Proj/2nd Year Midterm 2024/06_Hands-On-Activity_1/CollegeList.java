import java.util.Scanner;

class Person {
    protected String name;
    protected String contactNum;

    public void setName(String name) {
        this.name = name;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public String getName() {
        return name;
    }

    public String getContactNum() {
        return contactNum;
    }
}

class Employee extends Person {
    private double salary;
    private String department;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }
}

class Faculty extends Person {
    private String status;
    private boolean isRegular;

    public void setStatus(String status) {
        this.status = status;
    }

    public void setIsRegular(boolean isRegular) {
        this.isRegular = isRegular;
    }

    public String getStatus() {
        return status;
    }

    public boolean getIsRegular() {
        return isRegular;
    }
}

class Student extends Person {
    private String program;
    private int yearLevel;

    public void setProgram(String program) {
        this.program = program;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public String getProgram() {
        return program;
    }

    public int getYearLevel() {
        return yearLevel;
    }
}

public class CollegeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Press E for Employee, F for Faculty, or S for Student: ");
        char choice = sc.next().charAt(0);

        if (choice == 'E' || choice == 'e') {
            Employee employee = new Employee();

            System.out.println("Type employee's name: ");
            employee.setName(sc.next());
            System.out.println("Type contact number: ");
            employee.setContactNum(sc.next());
            System.out.println("Type salary: ");
            employee.setSalary(sc.nextDouble());
            System.out.println("Type department: ");
            employee.setDepartment(sc.next());

            System.out.println("\n-------------------------------");
            System.out.println("Name: " + employee.getName());
            System.out.println("Contact Number: " + employee.getContactNum());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println("Department: " + employee.getDepartment());

        } else if (choice == 'F' || choice == 'f') {
            Faculty faculty = new Faculty();

            System.out.println("Type faculty's name: ");
            faculty.setName(sc.next());
            System.out.println("Type contact number: ");
            faculty.setContactNum(sc.next());
            System.out.println("Is the faculty member regular/tenured? (Y/N): ");
            char regularInput = sc.next().charAt(0);

            if (regularInput == 'Y' || regularInput == 'y') {
                faculty.setIsRegular(true);
                faculty.setStatus("Tenured");
            } else {
                faculty.setIsRegular(false);
                faculty.setStatus("Non-Tenured");
            }

            System.out.println("\n-------------------------------");
            System.out.println("Name: " + faculty.getName());
            System.out.println("Contact Number: " + faculty.getContactNum());
            System.out.println("Status: " + faculty.getStatus());

        } else if (choice == 'S' || choice == 's') {
            Student student = new Student();

            System.out.println("Type student's name: ");
            student.setName(sc.next());
            System.out.println("Type contact number: ");
            student.setContactNum(sc.next());
            System.out.println("Type student's enrolled program (e.g., BSIT, BSTM): ");
            student.setProgram(sc.next());
            System.out.println("Type student's year level (1 to 4): ");
            student.setYearLevel(sc.nextInt());

            System.out.println("\n-------------------------------");
            System.out.println("Name: " + student.getName());
            System.out.println("Contact Number: " + student.getContactNum());
            System.out.println("Program: " + student.getProgram());
            System.out.println("Year Level: " + student.getYearLevel());

        } else {
            System.out.println("Invalid input.");
        }

                
    }
}

// Programmed by Sean: