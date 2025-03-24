import java.util.PriorityQueue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        Stack<Integer> stack = new Stack<>();

        // Adding elements to the stack
        for (int i = 0; i < 5; i++) {
            stack.push(i * 2);
        }

        // Adding elements to the queue
        /* write */ queue.offer(10);
        for (int i = 0; i < stack.size(); i++) {
            queue.offer(stack.get(i));
        }

        // Performing some operations on the stack
        while (!stack.isEmpty()) {
            System.out.println("Popped from stack: " + stack.pop());
        }

        // Reading from the queue
        /* read */ int value = queue.peek();
        System.out.println("Peeked from queue: " + value);

        // Adding more elements to the queue
        queue.offer(20);
        queue.offer(30);

        // Printing all elements in the queue
        while (!queue.isEmpty()) {
            System.out.println("Polled from queue: " + queue.poll());
        }
    }
}