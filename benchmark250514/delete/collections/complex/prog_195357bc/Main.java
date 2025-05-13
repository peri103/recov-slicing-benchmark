import org.apache.commons.collections4.buffer.CircularFifoBuffer;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        CircularFifoBuffer buffer = new CircularFifoBuffer(10);
        ArrayList<Integer> numbers = new ArrayList<>();
        HashMap<Integer, String> map = new HashMap<>();

        // Fill the map with some data
        for (int i = 0; i < 5; i++) {
            map.put(i, "Value" + i);
        }

        // Add some numbers to the list
        for (int i = 1; i <= 5; i++) {
            numbers.add(i * 10);
        }

        // Use the map to perform some operations
        if (map.containsKey(2)) {
            System.out.println("Map contains key 2 with value: " + map.get(2));
        }

        // Perform some operations on the list
        for (Integer number : numbers) {
            System.out.println("Number: " + number);
        }

        // Add a value to the buffer
        /* write */ buffer.add(42);

        // Do some more operations
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        // Retrieve the value from the buffer
        /* read */ Object value = buffer.get();
        System.out.println("Value from buffer: " + value);

        // Perform additional operations
        numbers.add(60);
        map.put(5, "NewValue");
        System.out.println("Updated map: " + map);
    }
}