import java.util.concurrent.SynchronousQueue;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        DataProcessor processor = new DataProcessor(queue);
        DataConsumer consumer = new DataConsumer(queue);
        Random random = new Random();

        // Create a student and add grades
        Student student = new Student("Alice");
        for (int i = 0; i < 5; i++) {
            student.addGrade(random.nextInt(100));
        }
        System.out.println("Student grades: " + student.getGrades());
        System.out.println("Average grade: " + student.calculateAverageGrade());

        // Create a thread to process data
        Thread processorThread = new Thread(() -> processor.processData(random.nextInt(100)));
        processorThread.start();

        // Consume the data
        consumer.consumeData();

        // Wait for the processor thread to finish
        try {
            processorThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}