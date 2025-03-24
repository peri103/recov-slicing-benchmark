import java.util.concurrent.LinkedTransferQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DataProcessor processor = new DataProcessor();
        Student student = new Student("Alice");

        // Adding scores to the student
        student.addScore(85);
        student.addScore(90);
        student.addScore(95);

        // Writing data to the queue
        processor.addData(1);

        // Processing student scores
        for (int score : student.getScores()) {
            System.out.println("Student score: " + score);
        }

        // Reading data from the queue
        /* read */ int value = processor.getData();
        System.out.println("Processed value: " + value);
    }
}