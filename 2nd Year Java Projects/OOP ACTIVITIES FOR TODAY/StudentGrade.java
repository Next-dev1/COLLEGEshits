public class StudentGrade {

    
    public static String calculateGrade(double subject1, double subject2) {
        double average = (subject1 + subject2) / 2;
        return determineGrade(average);
    }

    
    public static String calculateGrade(double subject1, double subject2, double subject3) {
        double average = (subject1 + subject2 + subject3) / 3;
        return determineGrade(average);
    }

    
    public static String calculateGrade(double[] subjects) {
        double total = 0;
        for (double score : subjects) {
            total += score;
        }
        double average = total / subjects.length;
        return determineGrade(average);
    }

    
    private static String determineGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        

        
        System.out.println("Grade (2 subjects): " + calculateGrade(85, 90));

        
        System.out.println("Grade (3 subjects): " + calculateGrade(75, 80, 88));

        
        double[] subjectArray = {70, 65, 80, 85};
        System.out.println("Grade (Array of subjects): " + calculateGrade(subjectArray));
    }
}
