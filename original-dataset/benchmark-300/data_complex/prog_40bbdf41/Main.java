import java.util.PriorityQueue;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();

        // Adding some random numbers to the linked list
        for (int i = 0; i < 5; i++) {
            linkedList.add(random.nextInt(100));
        }

        // Processing the linked list and adding elements to the priority queue
        for (Integer num : linkedList) {
            queue.offer(num * 2);
        }

        /* write */ queue.offer(10); // Original write operation

        // Performing some unrelated operations
        int sum = 0;
        for (Integer num : linkedList) {
            sum += num;
        }
        System.out.println("Sum of linked list elements: " + sum);

        // Polling elements from the priority queue
        while (!queue.isEmpty()) {
            System.out.println("Polled element: " + queue.poll());
        }

        /* read */ Integer value = queue.poll(); // Original read operation
        System.out.println("Original read value: " + value);
    }
}