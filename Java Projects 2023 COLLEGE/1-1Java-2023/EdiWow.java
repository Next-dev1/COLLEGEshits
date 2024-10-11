import java.util.Scanner;
public class EdiWow {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        
int first;
int second;

System.out.print("Enter first number :" );
first = input.nextInt();
System.out.print("Enter second number :" );
second = input.nextInt();

int total = first+second; 

System.out.print("Total :" + total );
        
    }
}