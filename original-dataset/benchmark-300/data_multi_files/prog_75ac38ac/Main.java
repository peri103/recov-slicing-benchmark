import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {
        DataProcessor processor = new DataProcessor();
        Student student = new Student("Alice");

        // Writing thread
        Thread writer = new Thread(() -> {
            processor.processData(95);
        });

        // Reading thread
        Thread reader = new Thread(() -> {
            int processedData = processor.getProcessedData();
            student.addScore(processedData);
            System.out.println("Processed score: " + processedData);
        });

        writer.start();
        reader.start();

        try {
            writer.join();
            reader.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Additional complex code
        System.out.println("Student " + student.getName() + "'s scores:");
        for (int score : student.getScores()) {
            System.out.println(score);
        }

        // More unrelated code
        SynchronousQueue<String> messageQueue = new SynchronousQueue<>();
        Thread messageWriter = new Thread(() -> {
            try {
                messageQueue.put("Hello from message writer!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread messageReader = new Thread(() -> {
            try {
                String message = messageQueue.take();
                System.out.println(message);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        messageWriter.start();
        messageReader.start();

        try {
            messageWriter.join();
            messageReader.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}