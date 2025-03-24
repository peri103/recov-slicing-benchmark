import java.util.concurrent.LinkedTransferQueue;

public class Main {
    public static void main(String[] args) {
        QueueManager queueManager = new QueueManager();
        Course course = new Course("Computer Science 101");
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);

        course.enrollStudent(student1);
        course.enrollStudent(student2);

        try {
            /* write */ queueManager.writeValue(42);

            // Print enrolled students
            for (Student student : course.getEnrolledStudents()) {
                System.out.println("Enrolled Student: " + student.getName() + " (ID: " + student.getStudentId() + ")");
            }

            /* read */ int value = queueManager.readValue();
            System.out.println("Value from QueueManager: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}