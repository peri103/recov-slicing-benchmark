import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableBiMap.Builder;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

public class Main {
    public static void main(String[] args) {
        // Original ImmutableBiMap
        Builder<String, Integer> builder = ImmutableBiMap.builder();
        /* write */ builder.put("key", 42);
        ImmutableBiMap<String, Integer> biMap = builder.build();

        // Additional ImmutableBiMap
        Builder<String, String> builder2 = ImmutableBiMap.builder();
        builder2.put("apple", "red");
        builder2.put("banana", "yellow");
        ImmutableBiMap<String, String> fruitColorMap = builder2.build();

        // ImmutableList example
        ImmutableList<String> immutableList = ImmutableList.of("one", "two", "three");
        for (String item : immutableList) {
            System.out.println("List item: " + item);
        }

        // ImmutableSet example
        ImmutableSet<Integer> immutableSet = ImmutableSet.of(1, 2, 3, 4, 5);
        for (Integer number : immutableSet) {
            System.out.println("Set item: " + number);
        }

        // Some unrelated computation
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Access the original biMap
        /* read */ int value = biMap.get("key");
        System.out.println("Read value from biMap: " + value);

        // Further use of fruitColorMap
        String appleColor = fruitColorMap.get("apple");
        System.out.println("Apple color: " + appleColor);

        // More unrelated computation
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 5: " + factorial);
    }
}