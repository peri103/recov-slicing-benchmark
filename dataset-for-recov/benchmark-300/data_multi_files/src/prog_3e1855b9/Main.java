import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) {
        try {
            Student student = new Student("Alice");
            student.processData(1);

            // Adding some unrelated operations
            BlockingQueue<String> messageQueue = new ArrayBlockingQueue<>(5);
            messageQueue.put("Hello");
            messageQueue.put("World");

            // More unrelated operations
            String firstMessage = messageQueue.take();
            System.out.println("First message: " + firstMessage);

            /* read */ int processedData = student.getDataProcessor().getDataQueue().take();
            System.out.println("Processed data: " + processedData);

            // Final operations
            String secondMessage = messageQueue.take();
            System.out.println("Second message: " + secondMessage);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}