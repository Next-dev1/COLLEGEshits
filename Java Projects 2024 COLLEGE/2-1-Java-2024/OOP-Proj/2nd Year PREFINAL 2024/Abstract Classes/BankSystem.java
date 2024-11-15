import java.util.Scanner;

abstract class BankAccount {
    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    abstract void deposit(double amount);

    abstract void withdraw(double amount);

    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Balance: " + balance + " PHP");
    }
}

class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.025; // 2.5% interest

    SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " PHP to Savings Account.");
        balance += balance * INTEREST_RATE;
        System.out.println("Interest applied: " + (INTEREST_RATE * 100) + "%");
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " PHP from Savings Account.");
        } else {
            System.out.println("Insufficient balance in Savings Account.");
        }
    }
}

class CheckingAccount extends BankAccount {
    private static final double TRANSACTION_FEE = 1.0; // 1 PHP transaction fee

    CheckingAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " PHP to Checking Account.");
    }

    @Override
    void withdraw(double amount) {
        if (amount + TRANSACTION_FEE <= balance) {
            balance -= (amount + TRANSACTION_FEE);
            System.out.println("Withdrawn " + amount + " PHP from Checking Account. FEE: " + TRANSACTION_FEE + " PHP");
        } else {
            System.out.println("Insufficient balance in Checking Account.");
        }
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        String accountHolder = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        System.out.println("\nChoose Account Type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Checking Account");
        System.out.print("Enter your choice: ");
        int accountChoice = scanner.nextInt();

        BankAccount account;
        if (accountChoice == 1) {
            account = new SavingsAccount(accountHolder, initialBalance);
        } else if (accountChoice == 2) {
            account = new CheckingAccount(accountHolder, initialBalance);
        } else {
            System.out.println("Invalid choice. Exiting system.");
            return;
        }

        while (true) {
            System.out.println("\nBank System Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 4) {
                System.out.println("Exiting the system. Goodbye!");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;
                case 3:
                    account.displayBalance();
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
// Programmed by Sean -_-