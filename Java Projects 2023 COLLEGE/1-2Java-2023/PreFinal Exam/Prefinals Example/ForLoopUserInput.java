import java.util.Scanner;
public class ForLoopUserInput {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
        
        int start, end;
        
        System.out.print("Start number: ");
        start = sc.nextInt();
        System.out.print("End number: ");
        end = sc.nextInt();
        
       
        for(start = start; start <= end; start++){
            System.out.println(start);
        }

      
    }
}