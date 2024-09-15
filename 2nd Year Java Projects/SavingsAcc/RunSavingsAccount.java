import java.util.Scanner;

class SavingsAccount {
    private double balance;
    public static double interestRate = 0;

    public SavingsAccount() {
        this.balance = 0;
    }

    public static void setInterestRate(double newRate) {
        interestRate = newRate;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public double withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return amount;
        } else {
            return 0;
        }
    }

    public void addInterest() {
        double interest = balance * interestRate;
        this.balance += interest;
    }

    public static void showBalance(SavingsAccount account) {
        System.out.println("Your balance is " + account.getBalance());
    }

    public static void showNewBalance(SavingsAccount account) {
        System.out.println("Your new balance is " + account.getBalance());
    }
}

public class RunSavingsAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingsAccount savings = new SavingsAccount();

        System.out.print("Enter interest rate: ");
        double interestRate = sc.nextDouble();
        SavingsAccount.setInterestRate(interestRate);

        System.out.print("Enter deposit amount: ");
        double depositAmount = sc.nextDouble();
        savings.deposit(depositAmount);
        SavingsAccount.showBalance(savings);  

        System.out.print("Press D for another deposit or W to withdraw: ");
        char choice = sc.next().charAt(0);

        if (choice == 'D' || choice == 'd') {
            System.out.print("Enter deposit amount: ");
            depositAmount = sc.nextDouble();
            savings.deposit(depositAmount); 

        } else if (choice == 'W' || choice == 'w') {
            System.out.print("Enter withdrawal amount: ");
            double withdrawAmount = sc.nextDouble();
            double withdrawn = savings.withdraw(withdrawAmount);
            if (withdrawn == 0) {
                System.out.println("Insufficient balance.");
            }
        }

        if (savings.getBalance() > 1000) {
            savings.addInterest();
        }

        SavingsAccount.showNewBalance(savings);  
        
    }
}

// Programmed by Sean BSIT - 301