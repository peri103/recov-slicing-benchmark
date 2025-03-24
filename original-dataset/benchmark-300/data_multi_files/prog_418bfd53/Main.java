import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        QueueManager queueManager = new QueueManager();
        Course course = new Course("Computer Science");

        // Add students to the course
        course.addStudent(new Student("Alice", 20));
        course.addStudent(new Student("Bob", 21));
        course.addStudent(new Student("Charlie", 22));

        // Create a thread to perform the write operation
        Thread writerThread = new Thread(() -> {
            queueManager.writeValue(42);
        });

        // Start the writer thread
        writerThread.start();

        // Perform some unrelated operations
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        for (int i = 0; i < list.size(); i++) {
            linkedList.add(list.get(i));
        }

        // Perform the read operation in the main thread
        int value = queueManager.readValue();
        System.out.println("Value from queue: " + value);

        // Print the contents of the linked list
        System.out.println("Contents of linked list:");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        // Print the students in the course
        System.out.println("Students in the course:");
        for (Student student : course.getStudents()) {
            System.out.println(student.getName() + " - " + student.getAge());
        }
    }
}