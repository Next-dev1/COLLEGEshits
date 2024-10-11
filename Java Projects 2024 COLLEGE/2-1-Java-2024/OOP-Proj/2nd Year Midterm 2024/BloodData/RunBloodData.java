import java.util.Scanner;

    class BloodData {
    static String bloodType;
    static String rhFactor;
    
    public BloodData (String bt, String rh) {
        this.bloodType = bt;
        this.rhFactor = rh;
    }

    public BloodData(){
        bloodType = "O";
        rhFactor = "+";

    }



        public void display(){
        System.out.println(bloodType + rhFactor + " is added to the blood bank.");

        }
    }


    public class RunBloodData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter blood type of patient: ");
        String bt = sc.nextLine();

        System.out.print("Enter the Rhesus factor (+ or -): ");
        String rh = sc.nextLine();

    if (bt.isEmpty() && rh.isEmpty()) {
        BloodData bd2 = new BloodData();
            bd2.display();
    } else {
        BloodData bd = new BloodData(bt, rh);
        bd.display();
    }

    }
}
// Programmed by Sean
