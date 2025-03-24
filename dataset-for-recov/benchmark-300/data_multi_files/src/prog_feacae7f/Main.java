import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Course mathCourse = new Course("Mathematics");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        mathCourse.addStudent(student1);
        mathCourse.addStudent(student2);

        // Add scores to students
        student1.addScore(85);
        student2.addScore(90);

        // Write to the PriorityQueue
        /* write */ student1.addScore(95);

        // Perform some operations
        for (Student student : mathCourse.getStudents()) {
            System.out.println("Student: " + student.getScores());
        }

        // Read from the PriorityQueue
        /* read */ Integer topScore = student1.getScores().poll();

        // Print the results
        System.out.println("Top score for Alice: " + topScore);
    }
}