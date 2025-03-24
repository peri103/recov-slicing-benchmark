import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DataProcessor processor = new DataProcessor();
        Course course = new Course("Computer Science");

        // Add some students to the course
        course.addStudent(new Student("Alice", 20));
        course.addStudent(new Student("Bob", 21));
        course.addStudent(new Student("Charlie", 22));

        // Thread to write the value
        Thread writerThread = new Thread(() -> {
            try {
                processor.writeData(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Thread to read the value
        Thread readerThread = new Thread(() -> {
            try {
                int value = processor.readData();
                System.out.println("Read value: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start both threads
        writerThread.start();
        readerThread.start();

        // Wait for both threads to finish
        writerThread.join();
        readerThread.join();

        // Print course details
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}