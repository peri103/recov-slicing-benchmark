import java.util.PriorityQueue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        Stack<Integer> stack = new Stack<>();
        
        // Adding some unrelated operations to make the program more complex
        stack.push(5);
        stack.push(15);
        stack.push(25);
        
        /* write */ queue.offer(10);
        
        int stackValue = stack.pop();
        System.out.println("Popped value from stack: " + stackValue);
        
        // Adding more unrelated operations
        for (int i = 0; i < 3; i++) {
            stack.push(i * 10);
        }
        
        /* read */ Integer value = queue.peek();
        System.out.println("Peeked value from queue: " + value);
        
        // More unrelated operations
        while (!stack.isEmpty()) {
            System.out.println("Stack value: " + stack.pop());
        }
    }
}