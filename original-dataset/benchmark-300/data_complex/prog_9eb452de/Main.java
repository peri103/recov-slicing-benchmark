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
            queue.add(i * 20);
        }
        
        // Perform some operations
        for (Object obj : list) {
            stack.push(obj);
        }
        
        /* write */ stack.push(1);
        
        // More operations
        for (Object obj : queue) {
            list.add(obj);
        }
        
        // Perform some complex operations
        for (int i = 0; i < list.size(); i++) {
            stack.push(list.get(i));
        }
        
        // Read the value written earlier
        /* read */ int value = (Integer) stack.peek();
        System.out.println(value);
        
        // Additional operations
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.get(i));
        }
    }
}