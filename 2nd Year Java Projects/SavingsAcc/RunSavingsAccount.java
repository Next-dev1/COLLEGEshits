import java.util.Scanner;

public class RunSavingsAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingsAccount savings = new SavingsAccount();
        
        
        System.out.print("Enter interest rate (in decimal, e.g., 0.05 for 5%): ");
        double rate = sc.nextDouble();
        SavingsAccount.setInterestRate(rate);

        
        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        savings.deposit(depositAmount);

        
        char option;
        do {
            System.out.print("Press D to deposit or W to withdraw: ");
            option = sc.next().toUpperCase().charAt(0);

            if (option == 'D') {
                System.out.print("Enter amount to deposit: ");
                double amount = sc.nextDouble();
                savings.deposit(amount);
            } else if (option == 'W') {
                System.out.print("Enter amount to withdraw: ");
                double amount = sc.nextDouble();
                double withdrawn = savings.withdraw(amount);
                if (withdrawn == 0) {
                    System.out.println("Insufficient balance.");
                }
            } else {
                System.out.println("Invalid option. Please choose D or W.");
            }

            SavingsAccount.showBalance(savings);

            if (savings.getBalance() > 1000) {
                savings.addInterest();
                System.out.println("Interest applied.");
                SavingsAccount.showBalance(savings);
            }

            System.out.print("Do you want to perform another operation? (Y/N): ");
            option = sc.next().toUpperCase().charAt(0);

        } while (option == 'Y');

        System.out.println("Thank you for using the savings account program.");
        
    }
}