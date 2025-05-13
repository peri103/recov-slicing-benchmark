import org.apache.commons.collections4.buffer.CircularFifoBuffer;

public class Main {
    public static void main(String[] args) {
        // Initialize the CircularFifoBuffer with a capacity of 10
        CircularFifoBuffer buffer = new CircularFifoBuffer(10);
        
        /* write */ buffer.add(42); // Add an element to the buffer
        
        /* read */ Object value = buffer.get(); // Read the first element from the buffer
        
        System.out.println(value); // Print the read value
    }
}