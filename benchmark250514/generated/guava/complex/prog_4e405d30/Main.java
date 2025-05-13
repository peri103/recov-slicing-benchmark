import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        // Unrelated code: Working with another map
        ImmutableMap<String, String> stringMap = ImmutableMap.<String, String>builder()
            .put("apple", "fruit")
            .put("carrot", "vegetable")
            .put("banana", "fruit")
            .build();
        
        // Print all entries in the stringMap
        for (String key : stringMap.keySet()) {
            System.out.println(key + ": " + stringMap.get(key));
        }
        
        // Original write-read pair
        ImmutableBiMap<String, Integer> map = ImmutableBiMap.<String, Integer>builder()
            /* write */ .put("one", 1)
            .put("two", 2)
            .put("three", 3)
            .build();

        // More unrelated code: Perform some calculations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Using a different BiMap
        ImmutableBiMap<String, String> capitalMap = ImmutableBiMap.<String, String>builder()
            .put("USA", "Washington D.C.")
            .put("France", "Paris")
            .put("Japan", "Tokyo")
            .build();
        
        // Print the capital of France
        System.out.println("Capital of France: " + capitalMap.get("France"));

        // Back to original map
        /* read */ Integer value = map.get("one");
        System.out.println("Value for 'one': " + value);

        // Unrelated loop to print numbers
        for (int i = 0; i < 5; i++) {
            System.out.println("Number: " + i);
        }
    }
}