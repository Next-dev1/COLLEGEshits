import java.util.Scanner;

public class MutRec {

    public static boolean IsEven (int num){

        if(num == 0){
            return true;
            
        } else { 
            return IsOdd (num - 1);
        }
    }
    public static boolean IsOdd (int num){
        
        if(num == 0){
            return false;
            
        } else { 
            return IsEven (num - 1);
        }
    }


    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (IsEven(num)){
            System.out.println((num) + " is an even number. ");
        } else {
            System.out.println((num) + "  is an odd number.");
        }
    }
}