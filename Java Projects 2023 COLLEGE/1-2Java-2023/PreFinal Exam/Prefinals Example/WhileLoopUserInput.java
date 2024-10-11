import java.util.Scanner;
public class WhileLoopUserInput {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
        
        int start, end;
        
        System.out.print("Start number: ");
        start = sc.nextInt();
        System.out.print("End number: ");
        end = sc.nextInt();
        
       
        while(start <= end){
            System.out.println(start);
            start++;
        }

      
    }
}