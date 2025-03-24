import java.util.concurrent.LinkedBlockingDeque;

public class Main {
    public static void main(String[] args) {
        DataProcessor processor = new DataProcessor();
        Student student = new Student("Alice");

        // Add some scores for the student
        student.addScore(85);
        student.addScore(90);
        student.addScore(95);

        // Process the data
        processor.processData(42);

        // Retrieve the processed data
        LinkedBlockingDeque<Integer> deque = processor.getDeque();
        try {
            /* read */ int value = deque.takeLast();
            System.out.println("Processed value: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print student information
        System.out.println("Student: " + student.getName());
        System.out.println("Scores: " + student.getScores());
    }
}