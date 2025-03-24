import java.util.Deque;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DequeManager dequeManager = new DequeManager();
        Random random = new Random();

        // Create a student and add some scores
        Student student = new Student("Alice");
        for (int i = 0; i < 5; i++) {
            student.addScore(random.nextInt(100));
        }

        // Add a value to the deque
        dequeManager.addToDeque(42);

        // Perform some operations with the student's scores
        for (int score : student.getScores()) {
            if (score > 50) {
                dequeManager.addToDeque(score);
            }
        }

        // Read the last value from the deque
        Deque<Integer> deque = dequeManager.getDeque();
        /* read */ int value = deque.getLast();
        System.out.println("The last value in the deque is: " + value);

        // Print student information
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Scores: " + student.getScores());
    }
}