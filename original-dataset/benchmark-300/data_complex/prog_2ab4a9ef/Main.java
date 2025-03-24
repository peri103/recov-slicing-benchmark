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

        /* write */ stack.push(1);

        // Perform some operations
        for (int i = 0; i < list.size(); i++) {
            stack.push(list.get(i));
        }

        for (int i = 0; i < linkedList.size(); i++) {
            stack.push(linkedList.get(i));
        }

        // Some unrelated code
        int sum = 0;
        for (int i = 0; i < stack.size(); i++) {
            sum += stack.get(i);
        }
        System.out.println("Sum of stack elements: " + sum);

        /* read */ int value = stack.peek();
        System.out.println("Value read from stack: " + value);

        // More unrelated code
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            newList.add(i * 5);
        }

        for (int i = 0; i < newList.size(); i++) {
            stack.push(newList.get(i));
        }

        System.out.println("Final stack size: " + stack.size());
    }
}