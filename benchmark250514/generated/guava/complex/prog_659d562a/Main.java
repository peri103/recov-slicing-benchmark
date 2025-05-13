import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableSetMultimap;

public class Main {
    public static void main(String[] args) {
        // Original write-read pair
        ImmutableListMultimap.Builder<String, String> builder = ImmutableListMultimap.builder();
        
        // Additional code using ImmutableSetMultimap
        ImmutableSetMultimap.Builder<String, Integer> setBuilder = ImmutableSetMultimap.builder();
        setBuilder.put("numbers", 1);
        setBuilder.put("numbers", 2);
        ImmutableSetMultimap<String, Integer> setMultimap = setBuilder.build();
        System.out.println("SetMultimap values for 'numbers': " + setMultimap.get("numbers"));

        // More complex operations
        for (int i = 0; i < 5; i++) {
            setBuilder.put("numbers", i * 10);
        }
        ImmutableSetMultimap<String, Integer> updatedSetMultimap = setBuilder.build();
        System.out.println("Updated SetMultimap values for 'numbers': " + updatedSetMultimap.get("numbers"));

        /* write */ builder.put("key", "value");
        ImmutableListMultimap<String, String> multimap = builder.build();

        // Additional unrelated logic
        int sum = 0;
        for (Integer number : updatedSetMultimap.get("numbers")) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        /* read */ String value = multimap.get("key").get(0);
        System.out.println("Value from ListMultimap: " + value);

        // Further unrelated logic
        int product = 1;
        for (Integer number : setMultimap.get("numbers")) {
            product *= number;
        }
        System.out.println("Product of numbers: " + product);
    }
}