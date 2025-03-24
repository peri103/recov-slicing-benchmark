import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        QueueWriter writer = new QueueWriter(queue);
        QueueReader reader = new QueueReader(queue);

        // Create a student object
        Student student = new Student("Alice", 20);
        System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());

        // Create a thread to write the value
        Thread writerThread = new Thread(() -> {
            try {
                writer.writeValue(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start the writer thread
        writerThread.start();

        // Create a thread to read the value
        Thread readerThread = new Thread(() -> {
            try {
                int value = reader.readValue();
                System.out.println("Value from queue: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start the reader thread
        readerThread.start();

        // Wait for the threads to finish
        try {
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}