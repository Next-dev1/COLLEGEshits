import java.util.Scanner;
class AmountDue {

    
    double computeAmountDue(double price) {
        double total = price + (price * 0.12); 
        return total;
    }

        double computeAmountDue(double price, double quantity) {
        double subtotal = price * quantity;
        double total = subtotal + (price * 0.12); 
        return total;
    }

    
    double computeAmountDue(double price, double quantity, double discount) {
        double subtotal = price * quantity;
        subtotal = subtotal - discount; 
        double total = subtotal + (price * 0.12); 
        return total;
    }
}


public class RunAmountDue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AmountDue due = new AmountDue();

        
        System.out.println("Press any of the following then enter values separated by spaces:");
        System.out.println("1 - Price only");
        System.out.println("2 - Price and quantity");
        System.out.println("3 - Price, quantity, and discount amount");

        
        int choice = sc.nextInt();

        double price;
        int quantity;
        double discount;
        double total = 0.0;

        // Depending on the choice, ask for appropriate inputs and compute the amount due
        if (choice == 1) {
            
            price = sc.nextDouble();
            total = due.computeAmountDue(price);
        } else if (choice == 2) {
            
            price = sc.nextDouble();
            quantity = sc.nextInt();
            total = due.computeAmountDue(price, quantity);
        } else if (choice == 3) {
            
            price = sc.nextDouble();
            quantity = sc.nextInt();
            discount = sc.nextDouble();
            total = due.computeAmountDue(price, quantity, discount);
        } else {
            System.out.println("Invalid choice! Please select 1, 2, or 3.");
            return;
        }

        
        System.out.printf("Amount due is %.1f\n", total);
    }
}
