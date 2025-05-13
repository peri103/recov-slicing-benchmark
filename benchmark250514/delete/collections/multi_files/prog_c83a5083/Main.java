public class Main {
    public static void main(String[] args) {
        // Create a new course
        Course course = new Course("Mathematics");

        // Create a new student
        Student student = new Student("Alice");

        // Enroll the student in the course
        course.enrollStudent(student);

        // Add a score for the student
        student.addScore("Math", 95);

        // Retrieve the student's scores
        StudentScores scores = student.getScores();

        // Get the score for a specific subject
        /* read */ Integer mathScore = scores.getScore("Math");

        System.out.println("Math score for Alice: " + mathScore);
    }
}