import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        DataProcessor dataProcessor = new DataProcessor();
        Course course = new Course("Computer Science");
        Student student = new Student("Alice", 101);
        course.enrollStudent(student);

        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.submit(() -> {
            try {
                System.out.println("Processing data...");
                /* write */ dataProcessor.processData(99);
                System.out.println("Data processed.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executor.submit(() -> {
            try {
                System.out.println("Retrieving data...");
                /* read */ int value = dataProcessor.retrieveData();
                System.out.println("Retrieved value: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Course: " + course.getCourseName());
        System.out.println("Enrolled Students:");
        for (Student s : course.getEnrolledStudents()) {
            System.out.println(s.getName() + " (ID: " + s.getStudentId() + ")");
        }
    }
}