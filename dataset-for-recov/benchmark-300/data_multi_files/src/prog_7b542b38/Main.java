import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        
        // Create a separate thread to perform the write operation
        Thread writerThread = new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        writerThread.start();
        
        // Perform some unrelated operations
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
            linkedList.add(i * 20);
        }
        
        // Print the list and linkedList contents
        System.out.println("ArrayList contents:");
        for (int num : list) {
            System.out.println(num);
        }
        
        System.out.println("LinkedList contents:");
        for (int num : linkedList) {
            System.out.println(num);
        }
        
        // Create a Course and add Students
        Course course = new Course("Computer Science");
        course.addStudent(new Student("Alice", 20));
        course.addStudent(new Student("Bob", 21));
        
        // Print the students in the course
        System.out.println("Students in the course:");
        for (Student student : course.getStudents()) {
            System.out.println(student.getName() + " - " + student.getAge());
        }
        
        // Perform the read operation in the main thread
        try {
            /* read */ int value = queue.take();
            System.out.println("Value taken from queue: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Ensure the writer thread completes
        try {
            writerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Perform more unrelated operations
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list2.add(i * 30);
        }
        
        System.out.println("Second ArrayList contents:");
        for (int num : list2) {
            System.out.println(num);
        }
    }
}