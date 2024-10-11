
import java.util.*;

public class favchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int favNum;
        String favCartChar;
        String nickName;
        char mi;

        System.out.print("Enter your favorite number: ");
        favNum = sc.nextInt();
        
        System.out.print("Enter your favorite character: ");
        favCartChar = sc.next();

        System.out.print("Enter your middle initial: ");
        mi = sc.next().charAt(0);

        System.out.print("Enter your nickname: ");
        nickName = sc.next();

        

        char nickNameArray[] = nickName.toCharArray();

        // Printing the user's information
        System.out.println("Your favorite number is " + favNum);
        System.out.println("Your favorite character is " + favCartChar);
        System.out.println("My name is Sean" + " " + mi + " " + "Mandayo.");
        System.out.println("You can call me" + " " + nickName + ".");




        
    }

    
}


