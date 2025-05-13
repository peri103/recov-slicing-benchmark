import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        // Original write-read pair
        Builder<String> builder = ImmutableSet.builder();
        /* write */ builder.add("Hello");

        // Additional code to make the program more complex
        ImmutableList<String> immutableList = ImmutableList.of("A", "B", "C");
        ImmutableMap<String, Integer> immutableMap = ImmutableMap.of("A", 1, "B", 2, "C", 3);
        
        // Process the immutable list
        for (String item : immutableList) {
            System.out.println("Item: " + item);
        }

        // Process the immutable map
        for (String key : immutableMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + immutableMap.get(key));
        }

        // Build the immutable set and perform the read operation
        ImmutableSet<String> immutableSet = builder.build();
        
        // Additional processing before the read
        if (!immutableSet.isEmpty()) {
            System.out.println("ImmutableSet is not empty.");
        }
        
        /* read */ boolean containsHello = immutableSet.contains("Hello");
        System.out.println("Contains 'Hello': " + containsHello);

        // Further processing after the read
        ImmutableList<Integer> numberList = ImmutableList.of(10, 20, 30, 40);
        int sum = 0;
        for (int number : numberList) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);
    }
}