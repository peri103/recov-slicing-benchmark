import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ImmutableRangeMap<Integer, String> rangeMap = ImmutableRangeMap.<Integer, String>builder()
            /* write */ .put(Range.closed(1, 10), "Low")
            .put(Range.closed(11, 20), "Medium")
            .put(Range.closed(21, 30), "High")
            .build();

        // Additional unrelated code to increase complexity
        Map<String, Integer> frequencyMap = new HashMap<>();
        String[] words = {"apple", "banana", "apple", "orange", "banana", "apple"};
        
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // More complex logic with a similar API pair
        ImmutableRangeMap<Integer, String> anotherRangeMap = ImmutableRangeMap.<Integer, String>builder()
            .put(Range.closed(1, 5), "Very Low")
            .put(Range.closed(6, 15), "Moderate")
            .put(Range.closed(16, 25), "Quite High")
            .build();

        String anotherValue = anotherRangeMap.get(7);
        System.out.println("Another RangeMap value for 7: " + anotherValue);

        // Using a loop to simulate complex operations
        for (int i = 1; i <= 30; i += 5) {
            String result = rangeMap.get(i);
            System.out.println("RangeMap value for " + i + ": " + result);
        }

        /* read */ String value = rangeMap.get(5);
        System.out.println("Original RangeMap value for 5: " + value);

        // Further complexity with nested loops
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("Nested loop: i = " + i + ", j = " + j);
            }
        }
    }
}