import java.util.Scanner;

public interface Payment2 {
    void paymentProcess(double amount); 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CreditCard c = new CreditCard();
        PayPal p = new PayPal();

        System.out.println("CreditCard Payment");
        System.out.print("Enter Account Number: ");
        c.accountNumber = sc.nextInt();
        System.out.print("Enter Amount: ");
        c.paymentProcess(sc.nextDouble());

        System.out.println();

        System.out.println("PayPal Payment");
        sc.nextLine(); // Consume newline left-over
        System.out.print("Enter Account Name: ");
        p.accountName = sc.nextLine();
        System.out.print("Enter Amount: ");
        p.paymentProcess(sc.nextDouble());
    }
}

class CreditCard implements Payment2 { 
    int accountNumber; double amount; 
    @Override 
    public void paymentProcess(double amount) { 
        this.amount = amount; System.out.println("You Have Entered: " + amount); 
        System.out.println("Credit Fee: 2.00 PHP"); 
        this.amount = this.amount - 2.00; System.out.println("Payment Successful"); 
        System.out.println("Total Amount: " + this.amount); 
    }
}

class PayPal implements Payment2 {
    String accountName;
    double amount;

    @Override
    public void paymentProcess(double amount) {
        this.amount = amount;
        System.out.println("You Have Entered: " + amount);
        System.out.println("PayPal Fee: 1.00 PHP");
        this.amount = this.amount - 1.00;
        System.out.println("Payment Successful");
        System.out.println("Total Amount: " + this.amount);
    }
}


