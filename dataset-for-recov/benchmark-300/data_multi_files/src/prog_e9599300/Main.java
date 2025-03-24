import java.util.List;

public class Main {
    public static void main(String[] args) {
        QueueManager queueManager = new QueueManager();
        Course course = new Course("Computer Science");

        // Add some students to the course
        course.addStudent(new Student("Alice", 20));
        course.addStudent(new Student("Bob", 22));

        // Write a value to the queue
        queueManager.writeValue(42);

        // Perform some unrelated operations
        List<Student> students = course.getStudents();
        for (Student student : students) {
            System.out.println(student.getName() + " is " + student.getAge() + " years old.");
        }

        // Read the value from the queue
        int value = queueManager.readValue();
        System.out.println("Value from queue: " + value);

        // Perform some more unrelated operations
        System.out.println("Course name: " + course.getCourseName());
    }
}