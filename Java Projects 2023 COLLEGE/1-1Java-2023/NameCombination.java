import java.util.Scanner;

    public class NameCombination {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        System.out.println("Enter three first names: ");
            System.out.println("");
            String name1 = sc.nextLine();
            String name2 = sc.nextLine();
            String name3 = sc.nextLine();
            System.out.println("");

                System.out.println("Possible names are:");
                System.out.println("1 - " + name1 + " " + name2);
                System.out.println("2 - " + name1 + " " + name3);
                System.out.println("3 - " + name2 + " " + name1);
                System.out.println("4 - " + name2 + " " + name3);
                System.out.println("5 - " + name3 + " " + name1);
                System.out.println("6 - " + name3 + " " + name2);
                    
                    System.out.print("Enter 1-6 to select a name: ");

                    int choice = sc.nextInt();
                    String selectedName = "";

                    if (choice == 1) {
                        selectedName = name1 + " " + name2;

                        } else if (choice == 2) {
                        selectedName = name1 + " " + name3;
                            } else if (choice == 3) {
                            selectedName = name2 + " " + name1;
                                } else if (choice == 4) {
                                    selectedName = name2 + " " + name3;
                                    } else if (choice == 5) {
                                        selectedName = name3 + " " + name1;
                                            } else if (choice == 6) {
                                            selectedName = name3 + " " + name2;
                                        }
                        System.out.println("The initials for " + selectedName + " is " + getInitials(selectedName));
                        System.out.println("Suggested username: " + getUsername(selectedName));
                    }
                    public static String getInitials(String name) {
                        String[] parts = name.split(" ");
                        String initials = "";
                        for (String part : parts) {
                            initials += part.charAt(0);
                        }
                        return initials;
                    }
                    public static String getUsername(String name) {
                        return name.toLowerCase().replace(" ", "_");
                    }
                }