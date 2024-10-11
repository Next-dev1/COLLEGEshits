import java.util.Scanner;
public class StringSwitchUserInput{
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
        String day;
        
        System.out.print("Enter day: ");
        day = sc.nextLine();
        
        switch(day){
            case "Monday":
                System.out.print("Monday nanamaaan!!");
                break;
            case "Tuesday":
                System.out.print("Lapit na Fridaaay!!");
                break;
            case "Wednesday":
                System.out.print("Kaya ko paaa!!");
                break;
            case "Thursday":
                System.out.print("Thursday is real!!");
                break;
            case "Friday":
                System.out.print("OHHH yess friday");
                break;  
            case "Saturday":
                System.out.print("May pasok pala ako");
                break;
            case "Sunday":
                System.out.print("Monday nanamaaan bukas!!");
                break;
            default:
                System.out.print("Maliii");
        }
    }
}