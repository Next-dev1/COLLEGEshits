import java.util.Scanner;

abstract class PaymentMethod {
    abstract double calculateFee(double amount);

    void processPayment(double amount) {
        System.out.println("Processing payment of " + amount + " PHP...");
        System.out.println("Payment successful!");
    }
}

class CreditCardPayment extends PaymentMethod {
    @Override
    double calculateFee(double amount) {
        return amount * 0.02; // 2% fee
    }
}

class PayPalPayment extends PaymentMethod {
    @Override
    double calculateFee(double amount) {
        return amount * 0.03; // 3% fee
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nPayment System");
            System.out.println("1. Credit Card Payment");
            System.out.println("2. PayPal Payment");
            System.out.println("3. Exit");
            System.out.print("Choose a payment method: ");
            int choice = scanner.nextInt();

            if (choice == 3) {
                System.out.println("Exiting the system. Goodbye!");
                break;
            }

            System.out.print("Enter the amount to pay: ");
            double amount = scanner.nextDouble();

            PaymentMethod paymentMethod;
            if (choice == 1) {
                paymentMethod = new CreditCardPayment();
            } else if (choice == 2) {
                paymentMethod = new PayPalPayment();
            } else {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            double fee = paymentMethod.calculateFee(amount);
            paymentMethod.processPayment(amount);
            System.out.println("Transaction fee: " + fee + " PHP");
            System.out.println("Total amount paid: " + (amount + fee) + " PHP");
        }

        scanner.close();
    }
}
// Programmed by Sean -_-