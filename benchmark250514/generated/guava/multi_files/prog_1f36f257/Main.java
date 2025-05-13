import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a course and students
        Course course = new Course("Mathematics");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Enroll students in the course
        course.enrollStudent(student1);
        course.enrollStudent(student2);

        // Add scores to students
        student1.addScore(95);
        student2.addScore(88);

        // Read scores from student1
        List<Integer> scores1 = student1.getScores();
        /* read */ int score1 = scores1.get(0);

        // Print results
        System.out.println("Course: " + course.getCourseName());
        System.out.println(student1.getName() + "'s score: " + score1);

        // Additional operations
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName());
            System.out.println("Scores: " + student.getScores());
        }
    }
}