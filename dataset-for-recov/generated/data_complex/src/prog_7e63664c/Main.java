import java.util.concurrent.LinkedBlockingDeque;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedBlockingDeque<Integer> deque = new LinkedBlockingDeque<>();
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        try {
            // Adding elements to stack
            for (int i = 0; i < 5; i++) {
                stack.push(i * 10);
            }

            // Adding elements to queue
            for (int i = 5; i < 10; i++) {
                queue.add(i * 10);
            }

            // Processing stack elements
            while (!stack.isEmpty()) {
                int stackValue = stack.pop();
                System.out.println("Stack Value: " + stackValue);
                deque.addLast(stackValue);
            }

            // Processing queue elements
            while (!queue.isEmpty()) {
                int queueValue = queue.poll();
                System.out.println("Queue Value: " + queueValue);
                deque.addLast(queueValue);
            }

            /* write */ deque.addLast(42);

            // Additional operations
            for (int i = 0; i < 3; i++) {
                deque.addLast(i * 100);
            }

            // Simulating delay
            Thread.sleep(1000);

            // Retrieve and print the last element added
            /* read */ int value = deque.takeLast();
            System.out.println("Deque Last Value: " + value);

            // Further processing of deque elements
            while (!deque.isEmpty()) {
                int dequeValue = deque.takeLast();
                System.out.println("Processed Deque Value: " + dequeValue);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}