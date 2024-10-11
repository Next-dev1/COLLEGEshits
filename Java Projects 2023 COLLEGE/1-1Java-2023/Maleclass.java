import java.util.Scanner;

public class Maleclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of male and female students
        System.out.print("Enter the number of males: ");
        int numMales = scanner.nextInt();
        
        System.out.print("Enter the number of females: ");
        int numFemales = scanner.nextInt();
        
        // Calculate the total number of students
        int totalStudents = numMales + numFemales;

        // Calculate the percentage of males and females
        double malePercentage = (double) numMales / totalStudents * 100;
        double femalePercentage = (double) numFemales / totalStudents * 100;

        // Display the results
        System.out.println("Number of students = " + totalStudents);
        System.out.println("Male = " + String.format("%.2f", malePercentage) + "%");
        System.out.println("Female = " + String.format("%.2f", femalePercentage) + "%");

        scanner.close();
    }
}
