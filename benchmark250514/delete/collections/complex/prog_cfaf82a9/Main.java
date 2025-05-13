import org.apache.commons.collections4.buffer.CircularFifoBuffer;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Initialize a CircularFifoBuffer with a capacity of 5
        CircularFifoBuffer buffer = new CircularFifoBuffer(5);
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add elements to the ArrayList
        for (int i = 0; i < 3; i++) {
            arrayList.add(i * 10);
        }

        // Add an element to the buffer
        /* write */ buffer.add(42);

        // Process ArrayList and add to LinkedList
        for (int value : arrayList) {
            linkedList.add(value * 2);
        }

        // Add more elements to the buffer
        buffer.add(100);
        buffer.add(200);

        // Retrieve the first element from the buffer
        /* read */ int value = (Integer) buffer.get();

        // Print the value to verify it was read correctly
        System.out.println("First value in buffer: " + value);

        // Print all elements in the LinkedList
        System.out.println("LinkedList elements:");
        for (int val : linkedList) {
            System.out.println(val);
        }

        // Add more operations to CircularFifoBuffer
        buffer.add(300);
        buffer.add(400);

        // Remove an element from the buffer
        buffer.remove();

        // Print remaining elements in the buffer
        System.out.println("Remaining buffer elements:");
        while (!buffer.isEmpty()) {
            System.out.println(buffer.remove());
        }
    }
}