import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        Course mathCourse = new Course("Mathematics");

        mathCourse.enrollStudent(student);
        student.addScore("Math", 95);

        // Enroll another student
        Student bob = new Student("Bob");
        mathCourse.enrollStudent(bob);
        bob.addScore("Math", 85);

        // Retrieve and print Alice's score
        SortedMap<String, Integer> aliceScores = student.getScores();
        /* read */ int aliceMathScore = aliceScores.get("Math");
        System.out.println("Alice's Math score: " + aliceMathScore);

        // Print all enrolled students
        for (Student enrolledStudent : mathCourse.getEnrolledStudents()) {
            System.out.println("Enrolled student: " + enrolledStudent.getScores());
        }
    }
}