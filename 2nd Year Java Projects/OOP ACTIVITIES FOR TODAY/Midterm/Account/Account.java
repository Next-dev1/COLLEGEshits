public class Account {
    String AccountNumber;
    String Holder;
    double Balance;

    public Account(){
        this.AccountNumber = "000000";

        this.Holder = "Unknown";
        this.Balance = 0;
    }

    public Account(String AccountNumber, String Holder, int Balance){
        this.AccountNumber = AccountNumber;
        this.Holder = Holder;
        this.Balance = Balance;
    }

    public Account(String AccountNumber, String Holder){
        this.AccountNumber = AccountNumber;
        this.Holder = Holder;
        
    }

    public void display(){
        System.out.println("Account Number: " + this.AccountNumber + ", Holder: " + this.Holder + ", Balance: " + this.Balance);
    }

    public static void main (String [] args){
        Account defaultAccount = new Account();
        System.out.println("Default Account Details:");
        defaultAccount.display();

        Account specificAccount = new Account("05146656" , "Kimberly Ann Cortez" , 1500);
        System.out.println("\nSpecific Account Details:");
        specificAccount.display();
        
        Account anotherAccount = new Account("655201" , "Jeremy Gonzales", 0);
        System.out.println("\nGeneral Account Details:");
        anotherAccount.display();

    }
}

// Programmed by Sean Mandayo