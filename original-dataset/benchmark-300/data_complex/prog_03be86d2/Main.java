import java.util.PriorityQueue;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        LinkedList<Integer> list = new LinkedList<>();
        Random random = new Random();

        // Add some random numbers to the LinkedList
        for (int i = 0; i < 5; i++) {
            list.add(random.nextInt(100));
        }

        // Process the LinkedList and add elements to the PriorityQueue
        for (Integer num : list) {
            queue.offer(num);
        }

        /* write */ queue.offer(10); // Original write operation

        // Perform some unrelated operations
        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        System.out.println("Sum of LinkedList elements: " + sum);

        // Poll elements from the PriorityQueue and print them
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        /* read */ int value = queue.poll(); // Original read operation
        System.out.println("Original read value: " + value);
    }
}