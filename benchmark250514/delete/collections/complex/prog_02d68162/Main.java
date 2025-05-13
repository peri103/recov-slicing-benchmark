import org.apache.commons.collections4.buffer.CircularFifoBuffer;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        CircularFifoBuffer<Integer> buffer = new CircularFifoBuffer<>(10);
        ArrayList<String> stringList = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        // Adding elements to the string list
        stringList.add("Hello");
        stringList.add("World");

        // Adding key-value pairs to the map
        map.put("One", 1);
        map.put("Two", 2);

        // Perform some operations on the map
        if (map.containsKey("One")) {
            System.out.println("Key 'One' exists with value: " + map.get("One"));
        }

        // Add elements to the buffer
        /* write */ buffer.add(42);

        // Perform some operations on the list
        for (String str : stringList) {
            System.out.println("String in list: " + str);
        }

        // Add more elements to the buffer
        buffer.add(100);
        buffer.add(200);

        // Calculate sum of elements in the buffer
        int sum = 0;
        for (Integer number : buffer) {
            sum += number;
        }
        System.out.println("Sum of buffer elements: " + sum);

        // Perform some operations on the map
        map.put("Three", 3);
        System.out.println("Updated map size: " + map.size());

        // Read element from the buffer
        /* read */ int value = buffer.get();
        System.out.println("Read value from buffer: " + value);

        // Add more elements to the buffer
        buffer.add(300);
        buffer.add(400);

        // Calculate average of elements in the buffer
        double average = sum / (double) buffer.size();
        System.out.println("Average of buffer elements: " + average);
    }
}