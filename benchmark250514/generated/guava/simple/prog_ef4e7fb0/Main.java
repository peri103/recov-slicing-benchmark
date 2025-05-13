import com.google.common.collect.EnumHashBiMap;

public class Main {
    public static void main(String[] args) {
        // Create an EnumHashBiMap instance
        EnumHashBiMap<MyEnum, String> map = EnumHashBiMap.create(MyEnum.class);

        // Write a value to the map
        /* write */ map.put(MyEnum.VALUE_ONE, "Hello");

        // Read the value from the map
        /* read */ String value = map.get(MyEnum.VALUE_ONE);

        // Print the value
        System.out.println(value);
    }
}

// Define an enum for use with EnumHashBiMap
enum MyEnum {
    VALUE_ONE,
    VALUE_TWO
}