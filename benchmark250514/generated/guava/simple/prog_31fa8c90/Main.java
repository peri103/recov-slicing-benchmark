import com.google.common.collect.EnumHashBiMap;

public class Main {
    public static void main(String[] args) {
        // Initialize EnumHashBiMap with an example Enum type and a value type
        EnumHashBiMap<ExampleEnum, String> enumHashBiMap = EnumHashBiMap.create(ExampleEnum.class);

        // Write operation: put a value into the map
        /* write */ enumHashBiMap.put(ExampleEnum.VALUE_ONE, "ExampleValue");

        // Read operation: retrieve the value from the map
        /* read */ String value = enumHashBiMap.get(ExampleEnum.VALUE_ONE);

        // Print the value to verify the correct operation
        System.out.println(value);
    }

    // Example enum for demonstration purposes
    private enum ExampleEnum {
        VALUE_ONE,
        VALUE_TWO
    }
}