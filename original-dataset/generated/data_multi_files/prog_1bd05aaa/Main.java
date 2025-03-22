import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) {
        // Initialize the ArrayBlockingQueue with a capacity of 10
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

        // Initialize the writer and reader
        QueueWriter writer = new QueueWriter(queue);
        QueueReader reader = new QueueReader(queue);

        // Create a Course and Students
        Course course = new Course("Computer Science");
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);

        // Enroll students in the course
        course.enrollStudent(student1);
        course.enrollStudent(student2);

        try {
            // Write a value to the queue
            writer.writeValue(42);

            // Simulate some unrelated operations with course and students
            for (Student student : course.getEnrolledStudents()) {
                System.out.println("Enrolled Student: " + student.getName() + ", ID: " + student.getId());
            }

            // Read the value from the queue
            int value = reader.readValue();

            // Print the value to ensure it is the one written
            System.out.println("Value from ArrayBlockingQueue: " + value);
        } catch (InterruptedException e) {
            // Handle the exception if the thread is interrupted
            e.printStackTrace();
        }
    }
}