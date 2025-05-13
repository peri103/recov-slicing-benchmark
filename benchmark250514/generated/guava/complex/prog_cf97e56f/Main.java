import com.google.common.collect.MinMaxPriorityQueue;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Original MinMaxPriorityQueue
        MinMaxPriorityQueue<Integer> queue = MinMaxPriorityQueue.create();
        /* write */ queue.add(10);

        // Additional PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(20);
        priorityQueue.add(5);
        priorityQueue.add(15);

        // Stack operations
        Stack<Integer> stack = new Stack<>();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.pop(); // remove top element

        // ArrayList operations
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // Some calculations
        int sum = 0;
        for (int num : priorityQueue) {
            sum += num;
        }
        System.out.println("Sum of PriorityQueue elements: " + sum);

        // Original MinMaxPriorityQueue read
        /* read */ Integer value = queue.peek();
        System.out.println("Peek value from MinMaxPriorityQueue: " + value);

        // More stack operations
        while (!stack.isEmpty()) {
            System.out.println("Stack pop: " + stack.pop());
        }
    }
}