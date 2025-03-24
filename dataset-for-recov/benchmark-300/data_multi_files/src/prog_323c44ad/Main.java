import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Initialize QueueManager
        QueueManager queueManager = new QueueManager();

        // Create a DelayedElement with a delay of 1 second
        DelayedElement element = new DelayedElement(1000); // 1 second delay

        // Add the element to the queue
        queueManager.addElement(element);

        // Perform some unrelated operations
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20));
        students.add(new Student("Bob", 22));

        // Print the list of students
        System.out.println("List of students:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Simulate some processing time
        Thread.sleep(500);

        // Take the element from the queue
        /* read */ DelayedElement takenElement = queueManager.takeElement();

        // Print the taken element
        System.out.println("Element taken: " + takenElement);

        // More unrelated operations
        List<String> courses = new ArrayList<>();
        courses.add("Math");
        courses.add("Science");

        // Print the list of courses
        System.out.println("List of courses:");
        for (String course : courses) {
            System.out.println(course);
        }
    }
}