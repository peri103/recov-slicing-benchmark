import com.google.common.collect.ImmutableSortedMultiset;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for the ImmutableSortedMultiset
        ImmutableSortedMultiset.Builder<Integer> builder = ImmutableSortedMultiset.<Integer>naturalOrder();
        
        // Some unrelated complex operations
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 3);
        map.put("banana", 2);
        map.put("orange", 5);

        ImmutableList<String> keys = ImmutableList.copyOf(map.keySet());
        for (String key : keys) {
            System.out.println("Fruit: " + key + ", Quantity: " + map.get(key));
        }

        // Another unrelated operation
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers: " + sum);
        
        /* write */ builder.add(1);
        
        // Build the ImmutableSortedMultiset
        ImmutableSortedMultiset<Integer> multiset = builder.build();
        
        // More unrelated operations
        for (int i = 0; i < 5; i++) {
            System.out.println("Counting: " + i);
        }
        
        /* read */ int count = multiset.count(1);
        System.out.println("Count of 1 in multiset: " + count);
        
        // Final unrelated operation
        StringBuilder sb = new StringBuilder();
        sb.append("Hello, ");
        sb.append("World!");
        System.out.println(sb.toString());
    }
}