import java.util.PriorityQueue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        Stack<Integer> stack = new Stack<>();
        
        // Adding some unrelated operations
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        /* write */ queue.offer(42);
        
        // Perform some operations on the stack
        int topElement = stack.pop();
        System.out.println("Popped element from stack: " + topElement);
        
        // Adding more elements to the queue
        queue.offer(100);
        queue.offer(200);
        
        // Perform some more operations
        int sum = 0;
        for (int num : queue) {
            sum += num;
        }
        System.out.println("Sum of elements in the queue: " + sum);
        
        /* read */ int value = queue.peek();
        System.out.println("Peeked value from the queue: " + value);
        
        // Additional operations
        stack.push(40);
        stack.push(50);
        
        while (!stack.isEmpty()) {
            System.out.println("Popping from stack: " + stack.pop());
        }
    }
}