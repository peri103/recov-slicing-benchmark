import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {
        DataProcessor processor = new DataProcessor();
        Student student = new Student("Alice");
        student.addScore(85);
        student.addScore(90);

        List<Student> students = new ArrayList<>();
        students.add(student);

        Course course = new Course("Math", students);
        course.printStudentScores();

        // Start a new thread to process data
        Thread processorThread = new Thread(() -> {
            processor.processData(100);
        });
        processorThread.start();

        // Perform the read operation in the main thread
        try {
            /* read */ int value = processor.getQueue().take();
            System.out.println("Processed data value: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}