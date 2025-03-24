import java.util.Stack;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        ArrayList list = new ArrayList();
        LinkedList queue = new LinkedList();

        // Initialize some data
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Add elements to the queue
        for (int i = 0; i < list.size(); i++) {
            queue.add(list.get(i));
        }

        /* write */ stack.push(42);

        // Process the queue
        while (!queue.isEmpty()) {
            System.out.println("Processing: " + queue.poll());
        }

        // Add more elements to the list
        for (int i = 5; i < 10; i++) {
            list.add(i * 10);
        }

        // Print the list
        System.out.println("List contents:");
        for (Object item : list) {
            System.out.println(item);
        }

        /* read */ int value = (Integer) stack.pop();
        System.out.println("Value from stack: " + value);
    }
}