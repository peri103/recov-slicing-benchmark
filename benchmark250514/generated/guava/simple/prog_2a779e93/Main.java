import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        // Create an ImmutableMap using the 'of' method
        /* write */ ImmutableMap<String, Integer> map = ImmutableMap.of("key", 42);

        // Read the value associated with the key "key"
        /* read */ Integer value = map.get("key");

        // Print the value
        System.out.println(value);
    }
}