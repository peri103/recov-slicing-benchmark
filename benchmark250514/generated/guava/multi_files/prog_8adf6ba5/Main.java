import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a new course
        Course course = new Course("Mathematics");

        // Create students and add them to the course
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        
        course.addStudent(student1);
        course.addStudent(student2);

        // Add scores to students
        student1.addScore(85);
        student2.addScore(90);

        // Get scores for a student
        List<Integer> aliceScores = student1.getScores();
        
        // Read a score from the list
        /* read */ int aliceScore = aliceScores.get(0);
        
        // Print the score
        System.out.println("Alice's first score: " + aliceScore);

        // Additional operations for complexity
        for (Student student : course.getStudents()) {
            System.out.println(student.getName() + " is enrolled in " + course.getCourseName());
        }
    }
}