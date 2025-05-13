import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableBiMap
        ImmutableBiMap.Builder<String, Integer> builder = ImmutableBiMap.builder();
        
        // Write to the builder
        /* write */ builder.put("one", 1);
        
        // Create an ImmutableList to store some values
        ImmutableList.Builder<String> listBuilder = ImmutableList.builder();
        listBuilder.add("apple");
        listBuilder.add("banana");
        listBuilder.add("cherry");
        
        // Build the ImmutableBiMap
        ImmutableBiMap<String, Integer> biMap = builder.build();
        
        // Perform some operations with the ImmutableList
        ImmutableList<String> fruitList = listBuilder.build();
        for (String fruit : fruitList) {
            System.out.println("Fruit: " + fruit);
        }
        
        // Perform a calculation
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 4: " + sum);
        
        // Read from the ImmutableBiMap
        /* read */ Integer value = biMap.get("one");
        
        // Output the read value
        System.out.println("Value from biMap: " + value);
        
        // More unrelated code
        for (int i = 0; i < fruitList.size(); i++) {
            System.out.println("Index " + i + ": " + fruitList.get(i));
        }
        
        // Another calculation
        int product = 1;
        for (int i = 1; i <= 3; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 3: " + product);
    }
}