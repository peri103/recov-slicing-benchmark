import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        QueueManager queueManager = new QueueManager();
        Course course = new Course("Computer Science");
        course.addStudent(new Student("Alice", 20));
        course.addStudent(new Student("Bob", 22));

        // Start a new thread to perform the write operation
        Thread writerThread = new Thread(() -> {
            queueManager.writeValue(42);
        });
        writerThread.start();

        // Add some unrelated operations
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            linkedList.add(list.get(i));
        }

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("LinkedList value: " + linkedList.get(i));
        }

        // Perform the read operation
        int value = queueManager.readValue();
        System.out.println("Value read from queue: " + value);

        // More unrelated operations
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}