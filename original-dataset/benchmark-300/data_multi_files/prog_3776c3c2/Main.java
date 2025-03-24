import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();

        // Create and process data
        DataProcessor processor = new DataProcessor(queue);
        Thread processorThread = new Thread(processor::processData);
        processorThread.start();

        // Create and consume data
        DataConsumer consumer = new DataConsumer(queue);
        Thread consumerThread = new Thread(consumer::consumeData);
        consumerThread.start();

        // Wait for threads to complete
        try {
            processorThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Create a course and add students
        Course course = new Course("Computer Science");
        course.addStudent(new Student("Alice", 20));
        course.addStudent(new Student("Bob", 22));

        // Print course details
        System.out.println(course);
    }
}