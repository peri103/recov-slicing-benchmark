public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        
        // Add a score for the student
        student.addScore(95);
        
        // Get the score and course name
        int score = student.getScore();
        String courseName = student.getCourseName();

        // Print the score and course name
        System.out.println("Student Score: " + score);
        System.out.println("Course Name: " + courseName);
    }
}