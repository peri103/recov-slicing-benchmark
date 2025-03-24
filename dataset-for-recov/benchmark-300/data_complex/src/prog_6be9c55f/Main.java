import java.util.PriorityQueue;
import java.util.Stack;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Stack<Integer> stack = new Stack<>();
        Random random = new Random();

        // Adding some random numbers to the stack
        for (int i = 0; i < 5; i++) {
            stack.push(random.nextInt(100));
        }

        // Performing some operations on the stack
        while (!stack.isEmpty()) {
            System.out.println("Popped from stack: " + stack.pop());
        }

        /* write */ priorityQueue.offer(42);

        // Adding more elements to the priority queue
        for (int i = 0; i < 3; i++) {
            priorityQueue.offer(random.nextInt(100));
        }

        // Performing some operations on the priority queue
        while (!priorityQueue.isEmpty()) {
            System.out.println("Polled from priority queue: " + priorityQueue.poll());
        }

        /* read */ Integer value = priorityQueue.peek();
        System.out.println("Peeked value from priority queue: " + value);
    }
}