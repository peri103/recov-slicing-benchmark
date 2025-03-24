import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        QueueManager queueManager = new QueueManager();

        // Create a new thread to perform the write operation
        Thread writerThread = new Thread(() -> {
            queueManager.putValue(42);
        });

        // Start the writer thread
        writerThread.start();

        // Create some students and add scores
        Student student1 = new Student("Alice");
        student1.addScore(90);
        student1.addScore(85);

        Student student2 = new Student("Bob");
        student2.addScore(78);
        student2.addScore(88);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        // Create a course and print student scores
        Course course = new Course("Math", students);
        course.printStudentScores();

        // Perform the read operation
        int value = queueManager.takeValue();
        System.out.println("Value from queue: " + value);

        // Perform some additional operations
        int totalScores = 0;
        for (Student student : students) {
            for (int score : student.getScores()) {
                totalScores += score;
            }
        }
        System.out.println("Total scores of all students: " + totalScores);
    }
}