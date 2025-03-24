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
        
        int stackValue = stack.pop();
        System.out.println("Popped value from stack: " + stackValue);
        
        /* write */ queue.offer(42);
        
        // More unrelated operations
        PriorityQueue<Integer> anotherQueue = new PriorityQueue<>();
        anotherQueue.offer(100);
        anotherQueue.offer(200);
        
        int anotherQueueValue = anotherQueue.poll();
        System.out.println("Polled value from another queue: " + anotherQueueValue);
        
        /* read */ Integer value = queue.peek();
        System.out.println("Peeked value from the original queue: " + value);
        
        // Additional operations to make the program more complex
        for (int i = 0; i < 5; i++) {
            stack.push(i * 5);
        }
        
        while (!stack.isEmpty()) {
            System.out.println("Stack value: " + stack.pop());
        }
    }
}