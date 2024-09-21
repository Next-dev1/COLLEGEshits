import java.util.Scanner;

public class CarRentalMembership {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username, password;
        while (true) {
            System.out.print("Enter Username: ");
            username = sc.nextLine();
            System.out.print("Enter Password: ");
            password = sc.nextLine();

            if (username.equals("Juan") && password.equals("2024")) {
                System.out.println("Correct  Password. Choose transaction.");
                System.out.println(" ");

                break;
            } else {
                System.out.println("Incorrect Password. Please try again.");
                System.out.println(" ");
            }
        }

        while (true) {
            System.out.println(" ");
            System.out.println("Services Offered");
            System.out.println("1- Rent a Car");
            System.out.println("2- Membership");
            System.out.println(" ");


            int choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 1) {
                
            System.out.println(" ");
                
                System.out.print("You choose # 1, Rent a Car. Choose the number assigned for the car you want to rent.\n");
                System.out.println("1. Compact Sedan (Php 550.00/day)");
                System.out.println("2. Minivan       (Php 700.00/day)");
                System.out.println("3. Midsize Suv   (Php 900.00/day)");
                System.out.println("4. Full Size     (Php 1,100.00/day)");
                System.out.println(" ");

                int carChoice = sc.nextInt();
                sc.nextLine(); 

                System.out.print("Please input the number of rental days: ");
                int rentalDays = sc.nextInt();
                sc.nextLine(); 

                double rentalFee = 0;
                if (carChoice == 1) {
                    rentalFee = 550.0;
                } else if (carChoice == 2) {
                    rentalFee = 700.0;
                } else if (carChoice == 3) {
                    rentalFee = 900.0;
                } else if (carChoice == 4) {
                    rentalFee = 1100.0;
                } else {
                    System.out.println("Invalid car choice.");
                    continue;
                }

                System.out.printf("The total rentals fee is: Php %.1f Thank you for renting a car!%n", rentalFee * rentalDays);

                
                System.out.print("Do you want to exit?  Y | N: ");
                String exitChoice = sc.nextLine();

                if (exitChoice.equalsIgnoreCase("Y")) {
                    break;
                }
            } else if (choice == 2) {

                System.out.println(" ");
                System.out.println("You choose  #2, Membership. Choose the number assigned for the membership you prefer.");
                System.out.println("1. Annual Membership (Php 500.00)");
                System.out.println("2. Monthly Membership(Php 100.00)");
                System.out.println(" ");

                int membershipChoice = sc.nextInt();
                sc.nextLine(); 

                if (membershipChoice == 1) {
                    System.out.println("You choose #1");
                    System.out.print("Please input the number of years: ");
                } else if (membershipChoice == 2) {
                    System.out.println("You choose #2");
                    System.out.print("Please input the number of months: ");
                } else {
                    System.out.println("Invalid membership choice.");
                    continue;
                }

                int months = sc.nextInt();
                sc.nextLine(); 

                double membershipFee = 0;
                if (membershipChoice == 1) {
                    membershipFee = 500.0;
                } else if (membershipChoice == 2) {
                    membershipFee = 100.0;
                }

                System.out.printf("The total membership fee is: Php %.1f Thank you for purchasing a membership!%n", membershipFee * months);

                
                System.out.print("Do you want to exit?  Y | N: ");
                String exitChoice = sc.nextLine();

                if (exitChoice.equalsIgnoreCase("Y")) {
                    break;
                }
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

// Programmed By Sean