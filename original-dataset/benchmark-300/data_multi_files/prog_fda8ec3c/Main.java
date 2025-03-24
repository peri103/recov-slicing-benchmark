import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {
        DataProcessor processor = new DataProcessor();
        Student student = new Student("Alice", 20);

        // Start a new thread to perform the write operation
        Thread writerThread = new Thread(() -> {
            processor.processData(student.getAge());
        });
        
        // Start the writer thread
        writerThread.start();
        
        // Perform the read operation in the main thread
        try {
            /* read */ int value = processor.getQueue().take();
            System.out.println("Student age from SynchronousQueue: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}