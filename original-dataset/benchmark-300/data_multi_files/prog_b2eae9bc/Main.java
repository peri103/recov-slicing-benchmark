import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        DataWriter writer = new DataWriter(queue);
        DataReader reader = new DataReader(queue);

        // Create a new thread to write data
        Thread writerThread = new Thread(() -> {
            writer.writeData(42);
        });
        writerThread.start();

        // Create a student and course
        Student student = new Student("Alice", 20);
        Course course = new Course("Computer Science");
        course.addStudent(student);

        // Read data from the queue
        int value = reader.readData();
        System.out.println("Value from SynchronousQueue: " + value);

        // Print student details
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());

        // Print course details
        System.out.println("Course Name: " + course.getCourseName());
        for (Student s : course.getStudents()) {
            System.out.println("Enrolled Student: " + s.getName());
        }
    }
}