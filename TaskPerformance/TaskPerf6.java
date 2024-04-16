import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class TaskPerf6 {

    public static void main(String[] args){
        Path filePath = Paths.get("records.txt");
        Scanner sc = new Scanner (System.in);

        while (true) {
            System.out.println("Enter 1 to Login, 2 to Register, or 0 to exit:");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    logIn(sc, filePath);
                    break;
                case 2:
                    signUp(sc, filePath);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 0.");
            }
        }
    }

    private static void logIn(Scanner sc, Path filePath) {
        System.out.println("Enter username:");
        String username = sc.nextLine().trim();
        System.out.println("Enter password:");
        String password = sc.nextLine().trim();

        try (BufferedReader br = Files.newBufferedReader(filePath)) {
            String line;
            boolean found = false;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("Name: ") && line.substring(6).equals(username)) {
                    found = true;
                    String nextLine = br.readLine();
                    if (nextLine != null && nextLine.startsWith("Password: ") && nextLine.substring(10).equals(password)) {
                        System.out.println("Successfully logged in!" + " " + "-" +  " " + username);
                        return;
                    }
                }
            }
            if (!found) {
                System.out.println("User not found. Please sign up first.");
            } else {
                System.out.println("Incorrect password.");
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }

    private static void signUp(Scanner sc, Path filePath) {
        System.out.println("Enter username:");
        String username = sc.nextLine().trim();
        System.out.println("Enter password:");
        String password = sc.nextLine().trim();
        System.out.println("Enter sex (M/F):");
        String sex = sc.nextLine().trim();
        System.out.println("Enter age:");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter email:");
        String email = sc.nextLine().trim();

        try (BufferedWriter bw = Files.newBufferedWriter(filePath, StandardOpenOption.APPEND, StandardOpenOption.CREATE)) {
            bw.write ("Sign up Successfully! ");
            bw.newLine();
            bw.write ("Name: "  + username  );
            bw.newLine();
            bw.write ("Password: " + password  );
            bw.newLine();
            bw.write ("Sex: " + sex  );
            bw.newLine();
            bw.write ("Age: " + age  );
            bw.newLine();
            bw.write ("Email: " + email  );
            bw.newLine();
            System.out.println("Account created Successfully!");

        }catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}