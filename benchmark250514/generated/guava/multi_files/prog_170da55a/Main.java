import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a student
        Student student = new Student("Alice", "S001");

        // Create a course and enroll the student
        Course course = new Course("Mathematics");
        course.enrollStudent(student);

        // Create a StudentScores object
        StudentScores studentScores = new StudentScores();
        
        // Add scores for the student
        studentScores.addScore(student.getId(), 95);
        studentScores.addScore(student.getId(), 88);

        // Retrieve and print the student's scores
        List<Integer> scores = studentScores.getScores(student.getId());
        /* read */ int firstScore = scores.get(0);
        System.out.println("First score for " + student.getName() + ": " + firstScore);

        // Print all enrolled students in the course
        for (Student s : course.getEnrolledStudents()) {
            System.out.println("Enrolled student: " + s.getName() + ", ID: " + s.getId());
        }
    }
}