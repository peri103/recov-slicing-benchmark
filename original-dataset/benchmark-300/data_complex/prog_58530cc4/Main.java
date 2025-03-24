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
            queue.add(i * 5);
        }

        // Perform some operations
        for (Object item : list) {
            stack.push(item);
        }

        /* write */ stack.push(42);

        // More operations
        for (Object item : queue) {
            list.add(item);
        }

        // Perform some complex operations
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                stack.push(list.get(i));
            } else {
                queue.add(list.get(i));
            }
        }

        /* read */ int value = (Integer) stack.peek();
        System.out.println("Peeked value: " + value);

        // Additional unrelated code
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 3);
        }

        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
    }
}