import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableClassToInstanceMap.Builder;
import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        Builder<Object> builder = ImmutableClassToInstanceMap.builder();
        ImmutableMap<Class<?>, Object> additionalMap = ImmutableMap.of(Integer.class, 42, Double.class, 3.14);

        // Insert some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Use another ImmutableClassToInstanceMap
        Builder<Object> anotherBuilder = ImmutableClassToInstanceMap.builder();
        anotherBuilder.putAll(additionalMap);
        ImmutableClassToInstanceMap<Object> anotherMap = anotherBuilder.build();

        // Perform operations with the new map
        Integer intValue = anotherMap.getInstance(Integer.class);
        Double doubleValue = anotherMap.getInstance(Double.class);
        System.out.println("Integer value: " + intValue);
        System.out.println("Double value: " + doubleValue);

        // Continue with original write-read pair
        /* write */ ImmutableClassToInstanceMap<Object> map = builder.put(String.class, "Hello, World!").build();

        // More unrelated operations
        String[] words = {"Java", "Guava", "Immutable"};
        for (String word : words) {
            System.out.println("Word: " + word);
        }

        // Final read operation
        /* read */ String value = map.getInstance(String.class);
        System.out.println(value);
    }
}