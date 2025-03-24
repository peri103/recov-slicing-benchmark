import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        QueueManager queueManager = new QueueManager();
        List<Student> students = new ArrayList<>();

        // Add some students
        students.add(new Student("Alice", 20));
        students.add(new Student("Bob", 22));

        // Start a new thread to perform the write operation
        new Thread(() -> {
            try {
                queueManager.putValue(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        // Perform some operations on the student list
        for (Student student : students) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        }

        // Perform the read operation in the main thread
        try {
            /* read */ int value = queueManager.takeValue();
            System.out.println("Value read from queue: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // More unrelated operations
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
    }
}