import java.util.Scanner;

public class EnterNumber {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of Male students =");
        int maleStudents = input.nextInt();
        System.out.println("Enter number of Female students =");
        int femaleStudents = input.nextInt();

        int totalStudents = maleStudents + femaleStudents;

        System.out.println("The total number of students: " + " "+ totalStudents);
        double percentageMale = (double) maleStudents / totalStudents *100 ;
        double percentageFemale = (double) femaleStudents / totalStudents *100 ;

        System.out.printf("Percentage of males in the class: %.2f\n", percentageMale);
        System.out.printf("Percentage of females in the class: %.2f\n", percentageFemale);

    }
}