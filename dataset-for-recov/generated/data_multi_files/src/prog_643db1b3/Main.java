import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {
        // Initialize SynchronousQueue
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();

        // Initialize writer and reader for SynchronousQueue
        SynchronousQueueWriter writer = new SynchronousQueueWriter(queue);
        SynchronousQueueReader reader = new SynchronousQueueReader(queue);

        // Writer thread
        Thread writerThread = new Thread(() -> {
            writer.writeValue(42);
        });

        // Reader thread
        Thread readerThread = new Thread(() -> {
            int value = reader.readValue();
        });

        writerThread.start();
        readerThread.start();

        try {
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Create a course and add students
        Course course = new Course("Mathematics");
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        alice.addScore(85);
        bob.addScore(90);

        course.addStudent(alice);
        course.addStudent(bob);

        // Print course details
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Scores: " + student.getScores());
        }
    }
}