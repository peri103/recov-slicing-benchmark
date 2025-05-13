import com.google.common.collect.ImmutableSet;

public class Main {
    public static void main(String[] args) {
        // Create a course and add students
        Course mathCourse = new Course("Mathematics");
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        mathCourse.addStudent(alice);
        mathCourse.addStudent(bob);

        // Add scores to students
        alice.addScore(95);
        bob.addScore(85);

        // Retrieve scores for Alice
        ImmutableSet<Integer> aliceScores = alice.getScores().getScores();
        
        // Read score from Alice's scores
        /* read */ boolean containsScore = aliceScores.contains(95);
        System.out.println("Alice has score 95: " + containsScore);

        // Display all students in the course
        for (Student student : mathCourse.getStudents()) {
            System.out.println("Student: " + student.getName());
        }
    }
}