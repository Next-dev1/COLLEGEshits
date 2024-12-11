import java.util.Scanner;

class BloodData {

    private String bloodType;
    private String rhFactor;
    
    // Setter and Getter method so we can use the BloodData and it's object
    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
    public String getBloodType(){
        return bloodType;
    }

    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }
    public String getRhFactor(){
        return rhFactor;
    }

    public BloodData(String bt, String rh) {
        this.bloodType = bt;
        this.rhFactor = rh;
    }
    // default blood
    public BloodData() {
        bloodType = "O";
        rhFactor = "+";

    }
    // this is where to display the default print if the user did not enter a value
    public void display() {
        System.out.println(bloodType + rhFactor + " is added to the blood bank.");

    }
}

public class RunBloodBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter blood type of patient: ");
        String bt = sc.nextLine().toUpperCase();

        System.out.print("Enter the Rhesus factor (+ or -): ");
        String rh = sc.nextLine();

        if (bt.isEmpty() && rh.isEmpty()) {
            BloodData bd2 = new BloodData();
            bd2.display();
        } else {
            BloodData bd = new BloodData(bt, rh);
    
            bd.setBloodType(bt);
            bd.setRhFactor(rh);
            bd.display();

        }

    }
}
// Programmed by Sean