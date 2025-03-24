import java.util.concurrent.PriorityBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.addScore(10);

        // Simulating other operations
        System.out.println("Processing student data...");

        // Retrieving and processing the data
        PriorityBlockingQueue<Integer> queue = student.getDataProcessor().getQueue();
        /* read */ Integer value = queue.poll();
        System.out.println("Value from queue: " + value);

        // Adding more data
        student.addScore(20);
        student.addScore(30);

        // Polling all elements from the queue
        while (!queue.isEmpty()) {
            System.out.println("Polled from queue: " + queue.poll());
        }
    }
}