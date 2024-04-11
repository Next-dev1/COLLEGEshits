import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LabExer6A {
    private static ArrayList<String> wordsList;
    private static String selectedWord;
    private static StringBuilder guessedWord;
    private static int attempts = 0;

    public static void main(String[] args) {
        boolean continuePlaying = true;
        boolean donePlaying = false;
        Scanner sc = new Scanner(System.in);

        while (continuePlaying) {
            loadWordsFromFile("words.txt");
            if (wordsList.isEmpty()) {
                System.out.println("No words found in the words.txt file.");
                return;
            }

            selectedWord = getRandomWord();
            guessedWord = new StringBuilder(selectedWord.replaceAll(".", "?"));
            System.out.println("---------------------------------");
            System.out.println("Welcome to GUESS THE WORD GAME!");
            System.out.println("---------------------------------");
            System.out.println("Uppercase only! No spaces or punctuation.");
            System.out.println("Try to guess the word: " + guessedWord);
            System.out.println("Enter a letter or guess the whole word:");

            while (!selectedWord.equals(guessedWord.toString())) {
                String input = sc.nextLine();
                if (input.length() == 1) {
                    char letter = input.charAt(0);
                    if (selectedWord.contains(String.valueOf(letter))) {
                        for (int i = 0; i < selectedWord.length(); i++) {
                            if (selectedWord.charAt(i) == letter) {
                                guessedWord.setCharAt(i, letter);
                            }
                        }
                        System.out.println("Correct! Guessed word so far: " + guessedWord);

                        if (guessedWord.toString().equals(selectedWord)) {
                            System.out.println("Congratulations! You guessed the word: " + selectedWord);
                            break;
                        }
                    } else {
                        attempts++;
                        System.out.println("Incorrect! Attempts: " + attempts);
                    }
                } else if (input.length() > 1) {
                    if (input.equals(selectedWord)) {
                        guessedWord = new StringBuilder(selectedWord);
                    } else {
                        attempts++;
                        System.out.println("Incorrect! Attempts: " + attempts);
                    }
                } else {
                    System.out.println("Invalid input. Please enter a letter or guess the whole word.");
                }
            }

            System.out.println("Do you want to play again? Press (Y) to play again or (N) to exit.");
            String playAgain = sc.nextLine();
            String exit = "N";
            continuePlaying = playAgain.equalsIgnoreCase("Y");
            donePlaying = exit.equalsIgnoreCase("N");
            System.out.println("Thank you for playing!!");
            
            
        }

        sc.close();
    }

    private static void loadWordsFromFile(String fileName) {
        wordsList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine())!= null) {
                wordsList.add(line.trim());
            }
        } catch (IOException e) {
            System.out.println("Error loading words from file: " + e.getMessage());
        }
    }

    private static String getRandomWord() {
        Random random = new Random();
        int index = random.nextInt(wordsList.size());
        return wordsList.get(index);
    }
}
//Programmed by Sean Mandayo
