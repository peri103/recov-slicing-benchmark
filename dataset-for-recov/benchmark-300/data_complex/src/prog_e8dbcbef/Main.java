import java.util.Stack;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList and LinkedList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
            linkedList.add(i * 20);
        }

        // Writing to the Stack
        /* write */ stack.push(42);

        // Processing the ArrayList and LinkedList
        for (Integer num : list) {
            stack.push(num);
        }

        for (Integer num : linkedList) {
            stack.push(num);
        }

        // Reading from the Stack
        /* read */ int value = stack.pop();
        System.out.println("Popped value: " + value);

        // Printing remaining elements in the Stack
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}