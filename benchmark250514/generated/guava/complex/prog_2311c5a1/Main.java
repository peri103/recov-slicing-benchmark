import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.Range;
import com.google.common.collect.ImmutableSet;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the ImmutableRangeSet using the builder
        ImmutableRangeSet.Builder<Integer> builder = ImmutableRangeSet.builder();
        /* write */ builder.add(Range.closed(1, 10));
        ImmutableRangeSet<Integer> rangeSet = builder.build();

        // Create a complex data structure using ImmutableSet and HashMap
        ImmutableSet<String> immutableSet = ImmutableSet.of("Apple", "Banana", "Cherry");
        Map<String, Integer> fruitPrices = new HashMap<>();
        fruitPrices.put("Apple", 100);
        fruitPrices.put("Banana", 50);
        fruitPrices.put("Cherry", 75);

        // Perform operations on the data structure
        for (String fruit : immutableSet) {
            if (fruitPrices.containsKey(fruit)) {
                System.out.println(fruit + " costs " + fruitPrices.get(fruit));
            }
        }

        // Use the contains method to check if a value is within the range
        boolean isInRange = false;
        for (int i = 0; i < 15; i++) {
            if (rangeSet.contains(i)) {
                isInRange = true;
                break;
            }
        }
        /* read */ System.out.println(isInRange);

        // Additional operations to make the program more complex
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10 is: " + sum);

        // More operations with the fruitPrices map
        int totalCost = 0;
        for (Integer price : fruitPrices.values()) {
            totalCost += price;
        }
        System.out.println("Total cost of all fruits: " + totalCost);
    }
}