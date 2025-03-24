import java.util.concurrent.BlockingDeque;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DataProcessor processor = new DataProcessor();
        Student student = new Student("John Doe");

        // Add some scores to the student
        student.addScore(85);
        student.addScore(90);

        // Process the student's scores
        for (int score : student.getScores()) {
            processor.addData(score);
        }

        // Add a special data point
        processor.addData(100);

        // Retrieve and print the last data point
        BlockingDeque<Integer> queue = processor.getDataQueue();
        /* read */ int lastData = queue.takeLast();
        System.out.println("Last data point: " + lastData);
    }
}