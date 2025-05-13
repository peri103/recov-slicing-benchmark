import org.apache.commons.collections4.queue.CircularFifoQueue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Original CircularFifoQueue write-read pair
        CircularFifoQueue<Integer> queue = new CircularFifoQueue<>(10);
        /* write */ queue.add(42);

        // Additional code using ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Additional code using LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Hello");
        linkedList.add("World");

        // Additional code using HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);

        // Perform operations on the queue
        int sum = 0;
        for (Integer num : list) {
            queue.add(num);
            sum += num;
        }

        // Retrieve and print values from LinkedList
        for (String str : linkedList) {
            System.out.println(str);
        }

        // Retrieve and print values from HashMap
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // More operations on the queue, without using read
        for (int i = 0; i < 3; i++) {
            queue.add(i * 100);
        }

        // Read from the queue
        /* read */ int value = queue.peek();
        System.out.println("Peek value: " + value);

        // Print the sum of added numbers
        System.out.println("Sum of numbers in list: " + sum);
    }
}