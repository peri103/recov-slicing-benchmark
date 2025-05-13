import com.google.common.collect.EnumMultiset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Define an example enum
enum Color {
    RED, GREEN, BLUE
}

public class Main {
    public static void main(String[] args) {
        // Initialize the EnumMultiset with the enum type
        EnumMultiset<Color> multiset = EnumMultiset.create(Color.class);
        
        // Add an element to the multiset
        /* write */ multiset.add(Color.RED);
        
        // Initialize another EnumMultiset for demonstration
        EnumMultiset<Color> anotherMultiset = EnumMultiset.create(Color.class);
        anotherMultiset.add(Color.GREEN);
        anotherMultiset.add(Color.BLUE);
        
        // Perform some operations on anotherMultiset
        int greenCount = anotherMultiset.count(Color.GREEN);
        int blueCount = anotherMultiset.count(Color.BLUE);
        System.out.println("Green count in anotherMultiset: " + greenCount);
        System.out.println("Blue count in anotherMultiset: " + blueCount);

        // Use a HashMap for unrelated operations
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Perform some calculations
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 5: " + sum);
        
        // Read the count of the element in the multiset
        /* read */ int count = multiset.count(Color.RED);
        
        // Print the count
        System.out.println("Red count in multiset: " + count);
    }
}