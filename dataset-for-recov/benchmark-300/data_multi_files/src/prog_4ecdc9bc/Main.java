import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DataProcessor processor = new DataProcessor();
        Student student = new Student("Alice");

        // Create a thread to perform the write operation
        Thread writerThread = new Thread(() -> {
            try {
                processor.writeData(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start the writer thread
        writerThread.start();

        // Add some scores to the student
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            student.addScore(random.nextInt(100));
        }

        // Perform the read operation in the main thread
        int value = processor.readData();
        System.out.println("Value from queue: " + value);

        // Print student details
        System.out.println("Student: " + student.getName());
        System.out.println("Scores:");
        for (int score : student.getScores()) {
            System.out.println(score);
        }

        // Wait for the writer thread to finish
        writerThread.join();
    }
}