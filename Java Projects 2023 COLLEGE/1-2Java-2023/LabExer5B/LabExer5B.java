import java.util.InputMismatchException;
import java.util.Scanner;

public class LabExer5B {
    public static void main(String[] args) {
        String[][] questions = {
               //This is the 10 questions and inside is the answer in 4th index
               {"Pogi ba si sir Motol?", "A. Syempre", "B. Hindi", "C. Medyo", "A",}, //Question 1
               {"Single ba si sir Motol?", "A. Broken", "B. Taken", "C. Complicated", "B"}, //Question 2
               {"Cute ba si sir Motol?", "A. Hindi", "B. Cute na Cute", "C. No way", "B"}, //Question 3
               {"Magaling ba mag turo si sir Motol?", "A. Mid", "B. Hindi", "C. Sobrang galing", "C"},  //Question 4
               {"Best prof ba si sir Motol?", "A. Sino si Sir Motol?", "B. Hindi", "C. The Best", "C"}, //Question 5
               {"Miss mo na ba siya?", "A. Oo", "B. Hindi", "C. Hindi na ako aasa", "C"}, //Question 6
               {"Gusto mo pa ba siya?", "A. As Friends", "B. Hindi", "C. Ayaw ko na sakaniya", "C"}, //Question 7
               {"Gusto mo ba siya makita?", "A. Puwede naman", "B. Hindi", "C. Please ayaw ko na", "B"}, //Question 8
               {"Sure ka mahal mo pa siya?", "A. Iyak ko nalang to", "B. Hindi", "C. It's complicated", "C"}, //Question 9
               {"Aamin ka ba sakaniya?", "A. Oo", "B. Hindi na", "C. Ititigil ko na pagiging delulu ko", "A"} //Question 10
        };

        int correctAnswers = 0; //To count the correct answers
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) { 
            System.out.println("\nQuestion " + (i + 1) + ": " + questions[i][0]); 
            System.out.println(questions[i][1]); 
            System.out.println(questions[i][2]);
            System.out.println(questions[i][3]);

            char answer = ' '; //Question
            boolean validInput = false; //To validate the answer

            do { 
                System.out.print("Enter your answer (A, B, or C): "); 

                try {
                    answer = sc.nextLine().toUpperCase().charAt(0);  //Get user input
                    if (answer != 'A' && answer != 'B' && answer != 'C') { 
                        throw new InputMismatchException("Invalid answer. Please enter A, B, or C."); 
                    
                    }
                    validInput = true; //Answer is valid
                } catch (InputMismatchException e) {
                    System.out.println("Error: " + e.getMessage());
                } catch (StringIndexOutOfBoundsException e) {
                    System.out.println("Error: No input provided. Please enter your answer.");
                }
            } while (!validInput);     

            // Answer Validation Logic
            char correctAnswer = questions[i][4].charAt(0);   //Correct answer from array
            if (answer == correctAnswer) {  
                correctAnswers++; 
                System.out.println("\nCorrect!");  
            } else {
                System.out.println("Incorrect. The correct answer is: " + questions[i][4]);  
            }
        }
        
        System.out.println("\nYour score: " + correctAnswers + " out of " + questions.length);  
        
    //Programmed by Sean Mandayo

    }
}