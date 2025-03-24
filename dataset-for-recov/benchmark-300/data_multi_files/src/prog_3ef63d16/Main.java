import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        DataWriter writer = new DataWriter(queue);
        DataReader reader = new DataReader(queue);

        // Thread to write data
        Thread writerThread = new Thread(writer::writeData);

        // Thread to read data
        Thread readerThread = new Thread(reader::readData);

        // Start the threads
        writerThread.start();
        readerThread.start();

        // Wait for threads to finish
        try {
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Additional code to make the program more complex
        Student student = new Student("Alice");
        student.addScore(90);
        student.addScore(85);

        Course course = new Course("Mathematics");
        course.addStudent(student);

        System.out.println("Student scores:");
        for (int score : student.getScores()) {
            System.out.println(score);
        }
    }
}