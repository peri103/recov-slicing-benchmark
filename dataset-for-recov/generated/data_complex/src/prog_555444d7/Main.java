import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        // Adding elements to the queue
        for (int i = 0; i < 5; i++) {
            queue.add(i * 10);
        }

        // Processing the queue
        while (!queue.isEmpty()) {
            int item = queue.poll();
            stack.push(item); // Pushing queue elements to stack
        }

        /* write */ stack.push(42);

        // Additional operations
        Stack<String> stringStack = new Stack<>();
        stringStack.push("Hello");
        stringStack.push("World");

        while (!stringStack.isEmpty()) {
            System.out.println("String Stack Pop: " + stringStack.pop());
        }

        // Further operations on the stack
        for (int i = 0; i < 3; i++) {
            stack.push(i * 100);
        }

        System.out.println("Stack size after operations: " + stack.size());

        /* read */ int value = stack.peek();
        System.out.println("Peeked value: " + value);

        // More stack operations
        while (!stack.isEmpty()) {
            System.out.println("Stack Pop: " + stack.pop());
        }
    }
}