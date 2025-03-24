import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DataProcessor processor = new DataProcessor();
        Student student = new Student("Alice");

        // Add some scores to the student
        student.addScore(90);
        student.addScore(85);
        student.addScore(95);

        // Process the student's scores
        for (int score : student.getScores()) {
            System.out.println(student.getName() + "'s score: " + score);
        }

        // Add data to the processor
        processor.addData(42);

        // Retrieve data from the processor
        /* read */ int value = processor.getData();
        System.out.println("Processed value: " + value);
    }
}