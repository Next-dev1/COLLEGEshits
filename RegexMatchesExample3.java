import java.util.Scanner;

public class RegexMatchesExample3 {
    enum Animal {
        CAT, DOG
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isValidAnimal = false;
        Animal animal = null;

        while (!isValidAnimal) {
            try {
                // Prompt the user to enter the animal name
                System.out.println("Enter the name of the animal (CAT or DOG): ");
                String animalName = scanner.nextLine().trim().toUpperCase();

                // Regular expression pattern
                String pattern = "^(CAT|DOG)$"; // matches "CAT" or "DOG"

                // Check if the animal matches the pattern
                boolean matches = animalName.matches(pattern);

                if (matches) {
                    isValidAnimal = true;
                    animal = Animal.valueOf(animalName);

                    // Using enum methods and examples
                    System.out.println("animal.toString() is " + animal.toString());
                    System.out.println("animal.ordinal() is " + animal.ordinal());
                    System.out.println("animal.equals(Animal.DOG) is " + animal.equals(Animal.DOG));
                    System.out.println("animal.compareTo(Animal.DOG) is " + animal.compareTo(Animal.DOG));
                    System.out.println("animal.compareTo(Animal.CAT) is " + animal.compareTo(Animal.CAT));

                    // Using static methods with enums
                    System.out.println("Animal.valueOf(\"CAT\") returns " + Animal.valueOf("CAT"));
                    System.out.println("Animal.values() returns an array with " + Animal.values().length + " elements");
                } else {
                    System.out.println("Invalid animal name entered. Please enter CAT or DOG.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid animal name entered. Please enter CAT or DOG.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
