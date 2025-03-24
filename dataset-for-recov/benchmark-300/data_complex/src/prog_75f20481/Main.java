import java.util.Stack;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        ArrayList list = new ArrayList();
        LinkedList queue = new LinkedList();

        // Initialize some data
        list.add(10);
        list.add(20);
        queue.add(30);
        queue.add(40);

        /* write */ stack.push(1);

        // Perform some operations
        for (Object obj : list) {
            stack.push(obj);
        }

        for (Object obj : queue) {
            stack.push(obj);
        }

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);

        // Perform more operations
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        /* read */ int value = (Integer) stack.pop();
        System.out.println("Original value: " + value);

        // Final operations
        stack.push(100);
        stack.push(200);
        System.out.println("Final stack size: " + stack.size());
    }
}