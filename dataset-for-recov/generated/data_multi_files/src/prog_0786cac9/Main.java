import java.util.PriorityQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class Main {
    public static void main(String[] args) {
        // Manage DelayQueue
        DelayQueueManager manager = new DelayQueueManager();
        DelayedElement element1 = new DelayedElement("Hello, World!", 1000);
        DelayedElement element2 = new DelayedElement("Goodbye, World!", 2000);
        manager.addElement(element1);
        manager.addElement(element2);

        // Create a Student and enroll in courses
        Student student = new Student("John Doe");
        student.enroll("Math");
        student.enroll("Science");

        // Utilize an ExecutorService to run tasks concurrently
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(() -> {
            try {
                // Simulate some work
                Thread.sleep(500);
                System.out.println("Task 1 completed");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executorService.submit(() -> {
            try {
                // Simulate some work
                Thread.sleep(300);
                System.out.println("Task 2 completed");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executorService.shutdown();

        try {
            // Retrieve elements from DelayQueue
            DelayedElement readElement = manager.retrieveElement();
            System.out.println("Read element: " + readElement.getValue());

            DelayedElement anotherReadElement = manager.retrieveElement();
            System.out.println("Read another element: " + anotherReadElement.getValue());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Process PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(3);

        while (!priorityQueue.isEmpty()) {
            int value = priorityQueue.poll();
            System.out.println("PriorityQueue element: " + value);
        }

        // Print student courses
        System.out.println("Student: " + student.getName());
        System.out.println("Courses: " + student.getCourses());
    }
}