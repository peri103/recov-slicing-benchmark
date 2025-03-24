import java.util.Vector;
import java.util.Stack;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Vector vector = new Vector();
        Stack stack = new Stack();
        Random random = new Random();

        // Add some random numbers to the stack
        for (int i = 0; i < 5; i++) {
            stack.push(random.nextInt(100));
        }

        // Perform some operations with the stack
        while (!stack.isEmpty()) {
            int num = (Integer) stack.pop();
            System.out.println("Popped from stack: " + num);
        }

        // Write to the vector
        /* write */ vector.addElement(42);

        // Add more elements to the vector
        for (int i = 0; i < 5; i++) {
            vector.addElement(random.nextInt(100));
        }

        // Read from the vector
        /* read */ int value = (Integer) vector.elementAt(0);
        System.out.println("Read from vector: " + value);

        // Print all elements in the vector
        for (int i = 0; i < vector.size(); i++) {
            System.out.println("Vector element at " + i + ": " + vector.elementAt(i));
        }
    }
}