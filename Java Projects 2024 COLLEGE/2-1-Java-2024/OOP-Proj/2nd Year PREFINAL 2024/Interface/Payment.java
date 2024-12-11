import java.util.Scanner;

public abstract class Payment {

    abstract void paymentProcess(double amount);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CreditCard c = new CreditCard();
        PayPal p = new PayPal();

        System.out.println("CreditCard Payment");
        System.out.print("Enter AccountNumber: ");
        c.accountNumber = sc.nextInt();
        System.out.print("Enter Amount: ");
        c.paymentProcess(sc.nextDouble());

        System.out.println();
        
        System.out.println("PayPal Payment");
        System.out.print("Enter AccountName: ");
        p.accountName = sc.nextLine();
        sc.nextLine();
        System.out.print("Enter Amount: ");
        p.paymentProcess(sc.nextDouble());
        
    }
}

class CreditCard extends  Payment {
    int accountNumber;
    double amount;
    
    public void paymentProcess(double amount) {
        this.amount = amount;
        System.out.println("You Have Entered: " + amount);
        System.out.println("Credit Fee: 2.00 PHP");
        this.amount = this.amount -  2.00;
        System.out.println("Payment Succesful");
        System.out.println("Total Amount: " + this.amount);

    }
} 

class PayPal extends Payment {
    String accountName;
    double amount;

    public void paymentProcess(double amount) {
        this.amount = amount;
        System.out.println("You Have Entered: " + amount);
        System.out.println("PayPal Fee: 1.00 PHP");
        this.amount = this.amount -  1.00;
        System.out.println("Payment Succesful");
        System.out.println("Total Amount: " + this.amount);

    }

}
