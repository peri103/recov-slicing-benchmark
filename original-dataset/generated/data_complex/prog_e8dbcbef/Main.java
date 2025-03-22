import java.util.Stack;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add elements to the arrayList
        for (int i = 0; i < 5; i++) {
            arrayList.add(i * 5);
        }

        // Add elements to the linkedList
        for (int i = 0; i < 3; i++) {
            linkedList.add(i * 10);
        }

        // Process arrayList
        for (int value : arrayList) {
            stack.push(value);
        }

        // Process linkedList
        for (int value : linkedList) {
            stack.push(value * 2);
        }

        // Adding a new element to stack
        /* write */ stack.push(42);

        // Perform additional operations
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        System.out.println("Sum of all elements: " + sum);

        // Repopulate stack for demonstration
        for (int i = 1; i <= 5; i++) {
            stack.push(i);
        }

        // Further operations
        int max = Integer.MIN_VALUE;
        while (!stack.isEmpty()) {
            int current = stack.pop();
            if (current > max) {
                max = current;
            }
        }
        System.out.println("Maximum value: " + max);

        // Repopulate stack to demonstrate original read
        stack.push(100);
        stack.push(200);
        stack.push(300);

        // Finally read the value
        /* read */ int value = stack.pop();
        System.out.println("Popped value: " + value);
    }
}