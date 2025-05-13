import org.apache.commons.collections4.buffer.CircularFifoBuffer;

public class Main {
    public static void main(String[] args) {
        // Initialize a CircularFifoBuffer with a capacity of 5
        CircularFifoBuffer buffer = new CircularFifoBuffer(5);

        // Add an element to the buffer
        /* write */ buffer.add(42);

        // Retrieve the first element from the buffer
        /* read */ int value = (Integer) buffer.get();

        // Print the value to verify it was read correctly
        System.out.println(value);
    }
}