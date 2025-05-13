import org.apache.commons.collections4.buffer.CircularFifoBuffer;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the CircularFifoBuffer with a capacity of 10
        CircularFifoBuffer buffer = new CircularFifoBuffer(10);
        
        // Initialize a HashMap and ArrayList for additional complexity
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        // Populate the HashMap with some values
        map.put("Key1", 100);
        map.put("Key2", 200);
        
        // Populate the ArrayList with some values
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }
        
        // Perform some operations on the HashMap
        int valueFromMap = map.get("Key1");
        map.put("Key3", valueFromMap + 50);
        
        // Perform some operations on the ArrayList
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + 5);
        }
        
        // Add an element to the buffer
        /* write */ buffer.add(42);
        
        // Perform some operations using a loop and conditional statement
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
            if (sum > 50) {
                break;
            }
        }
        
        // Read the first element from the buffer
        /* read */ Object value = buffer.get();
        
        // Print the read value
        System.out.println(value);
        
        // Print the modified HashMap and ArrayList values
        System.out.println("HashMap: " + map);
        System.out.println("ArrayList: " + list);
    }
}