import java.util.Stack;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Initialize some data
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
            linkedList.add(i * 20);
        }

        // Perform some operations
        for (int i = 0; i < list.size(); i++) {
            stack.push(list.get(i));
        }

        /* write */ stack.push(42);

        // More operations
        for (int i = 0; i < linkedList.size(); i++) {
            stack.push(linkedList.get(i));
        }

        // Perform some unrelated operations
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        System.out.println("Sum of list elements: " + sum);

        /* read */ int value = stack.peek();
        System.out.println("Value read from stack: " + value);

        // Additional operations
        for (int i = 0; i < stack.size(); i++) {
            System.out.println("Stack element at index " + i + ": " + stack.get(i));
        }
    }
}