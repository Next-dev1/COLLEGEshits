import java.util.Scanner;

public class LabExer5B {
    public static void main(String[] args) {
        String[][] questions = {
            //Question 1
            {"Pogi ba si sir Motol?", "A. Oo", "B. Hindi", "C. Medyo"}, 
            //Question 2
            {"Single ba si sir Motol?", "A. Oo", "B. Taken", "C. Complicated"},
            //Question 3
            {"Cute ba si sir Motol?", "A. Oo", "B. Sometimes", "C. No way"},
            //Question 4
            {"Magaling ba mag turo si sir Motol?", "A. Oo", "B. Hindi", "C. Magaling"},
            //Question 5
            {"Best prof ba si sir Motol?", "A. Oo", "B. Hindi", "C. Syempre"},
            //Question 6
            {"Miss mo na ba siya?", "A. Oo", "B. Hindi", "C. Hindi na ako aasa"},
            //Question 7
            {"Gusto mo pa ba siya?", "A. Oo", "B. Hindi", "C. Ayaw ko na sakaniya"},
            //Question 8
            {"Gusto mo ba siya makita?", "A. Oo", "B. Hindi", "C. Please ayaw ko na"},
            //Question 9
            {"Sure ka mahal mo pa siya?", "A. Oo", "B. Hindi", "C. It's complicated"},
            //Question 10
            {"Aamin ka ba sakaniya?", "A. Oo", "B. Hindi", "C. Ititigil ko na pagiging delulu ko"},
            // Add more questions here
        };

        int score = 0;
        Scanner sc = new Scanner(System.in);

        for (String[] question : questions) {
            System.out.println(question[0]);
            System.out.println(question[1]);
            System.out.println(question[2]);
            System.out.println(question[3]);

            String userAnswer = sc.next().toUpperCase();

            try {
                if (!userAnswer.equals("A") && !userAnswer.equals("B") && !userAnswer.equals("C")) {
                    throw new Exception("Invalid letter. Please enter A, B, or C.");
                }

                if (userAnswer.equals(getCorrectAnswer(question[0]))) {
                    score++;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Please answer again:");
                userAnswer = sc.next().toUpperCase();

                if (userAnswer.equals(getCorrectAnswer(question[0]))) {
                    score++;
                }
            }
        }

        

        System.out.println("Your final score is: " + score);
    }

    private static String getCorrectAnswer(String question) {
        if (question.contains("Pogi")) { //Answer 1
            return "A";
        }
        if (question.contains("Single")) { //Answer 2
            return "B";
        }
        if (question.contains("Cute")) { //Answer 3
            return "B";
        }
        if (question.contains("Magaling")) { //Answer 4
            return "C";
        }
        if (question.contains("Best")) { //Answer 5
            return "C";
        }
        if (question.contains("Miss")) { //Answer 6
            return "C";
        }
        if (question.contains("Gusto mo pa")) { //Answer 7
            return "C";
        }
        if (question.contains("Gusto mo ba")) { //Answer 8
            return "B";
        }
        if (question.contains("Sure")) { //Answer 9
            return "C";
        }
        if (question.contains("Aamin")) { //Answer 10
            return "C";
        }

        // Add more correct answers here

        return "";
    }
}