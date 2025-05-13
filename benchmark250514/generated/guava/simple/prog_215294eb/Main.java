import com.google.common.collect.ImmutableBiMap;

public class Main {
    public static void main(String[] args) {
        // Create an ImmutableBiMap using the write method
        /* write */ ImmutableBiMap<String, Integer> biMap = ImmutableBiMap.of("one", 1, "two", 2, "three", 3);

        // Read a value from the ImmutableBiMap using the read method
        /* read */ Integer value = biMap.get("two");
        
        // Print the value to verify
        System.out.println(value);
    }
}