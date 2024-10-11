public class Student {
    // Private fields for encapsulation
    private int studentId;
    private String studentName;
    private String enrolledCourse;

    // Constructor
    public Student(int studentId, String studentName, String enrolledCourse) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.enrolledCourse = enrolledCourse;
    }

    // Getters and Setters
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getEnrolledCourse() {
        return enrolledCourse;
    }

    public void setEnrolledCourse(String enrolledCourse) {
        this.enrolledCourse = enrolledCourse;
    }

    public static void main(String[] args) {
        Student student = new Student(1, "Alice Guo", "Politics");
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Enrolled Course: " + student.getEnrolledCourse());
    }
}
