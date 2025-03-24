import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        DataProcessor dataProcessor = new DataProcessor();

        // Create a thread to perform the write operation
        Thread writerThread = new Thread(() -> {
            try {
                dataProcessor.writeData(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Create a thread to perform the read operation
        Thread readerThread = new Thread(() -> {
            try {
                int value = dataProcessor.readData();
                System.out.println("Value from queue: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start both threads
        writerThread.start();
        readerThread.start();

        // Wait for both threads to finish
        try {
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Create some students and a course
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);
        Course course = new Course("Computer Science");

        // Add students to the course
        course.addStudent(student1);
        course.addStudent(student2);

        // Print course details
        System.out.println(course);

        // Perform some additional operations
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        for (Integer num : list) {
            linkedList.add(num);
        }

        System.out.println("Elements in linkedList:");
        for (Integer num : linkedList) {
            System.out.println(num);
        }

        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        System.out.println("Sum of elements in list: " + sum);

        LinkedList<Integer> reversedList = new LinkedList<>();
        for (Integer num : linkedList) {
            reversedList.addFirst(num);
        }

        System.out.println("Reversed linkedList:");
        for (Integer num : reversedList) {
            System.out.println(num);
        }
    }
}