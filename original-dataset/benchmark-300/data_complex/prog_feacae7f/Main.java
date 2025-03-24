import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add some elements to the ArrayList and LinkedList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
            linkedList.add(i * 20);
        }

        // Perform some operations on the ArrayList and LinkedList
        for (int i = 0; i < list.size(); i++) {
            linkedList.set(i, linkedList.get(i) + list.get(i));
        }

        // Write to the PriorityQueue
        /* write */ queue.offer(42);

        // Perform more operations
        for (int i = 0; i < linkedList.size(); i++) {
            list.set(i, list.get(i) + linkedList.get(i));
        }

        // Read from the PriorityQueue
        /* read */ Integer value = queue.poll();

        // Print the results
        System.out.println("Value from PriorityQueue: " + value);
        System.out.println("Modified ArrayList: " + list);
        System.out.println("Modified LinkedList: " + linkedList);
    }
}