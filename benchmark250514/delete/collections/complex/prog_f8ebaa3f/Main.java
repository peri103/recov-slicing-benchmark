import org.apache.commons.collections4.buffer.CircularFifoBuffer;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        CircularFifoBuffer<Integer> buffer = new CircularFifoBuffer<>(10);
        ArrayList<Integer> extraList = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        // Fill the map with some data
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // Add some elements to the extra list
        for (int i = 0; i < 5; i++) {
            extraList.add(i * 2);
        }

        // Perform operations on the map
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // Add some elements to the buffer
        for (int i = 0; i < 3; i++) {
            buffer.add(i + 10);
        }

        // Insert more complex logic here
        int sum = 0;
        for (int num : extraList) {
            sum += num;
        }
        System.out.println("Sum of elements in extraList: " + sum);

        // Add a single element to the buffer
        /* write */ buffer.add(1);

        // More operations on the buffer
        int bufferSum = 0;
        for (int num : buffer) {
            bufferSum += num;
        }
        System.out.println("Sum of elements in buffer: " + bufferSum);

        // Read the element from the buffer
        /* read */ int value = buffer.get();
        System.out.println("Read value from buffer: " + value);

        // Perform additional operations on the extraList
        for (int i = 0; i < extraList.size(); i++) {
            extraList.set(i, extraList.get(i) + value);
        }

        // Print updated extraList
        System.out.println("Updated extraList: " + extraList);
    }
}