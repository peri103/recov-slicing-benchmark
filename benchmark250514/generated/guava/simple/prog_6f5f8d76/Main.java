import com.google.common.collect.EnumHashBiMap;

public class Main {
    public static void main(String[] args) {
        // Initialize an EnumHashBiMap with an example enum class
        EnumHashBiMap<ExampleEnum, String> map = EnumHashBiMap.create(ExampleEnum.class);

        // Write a value to the map using the put method
        /* write */ map.put(ExampleEnum.FIRST, "Hello");

        // Read the value from the map using the get method
        /* read */ String value = map.get(ExampleEnum.FIRST);

        // Print the value to verify it was read correctly
        System.out.println(value);
    }

    // Example enum to use with the EnumHashBiMap
    private enum ExampleEnum {
        FIRST, SECOND;
    }
}