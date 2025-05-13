import com.google.common.collect.EnumHashBiMap;

public class Main {
    public static void main(String[] args) {
        // Create an EnumHashBiMap instance
        EnumHashBiMap<MyEnum, Integer> map = EnumHashBiMap.create(MyEnum.class);

        // Write a value to the map using the put method
        /* write */ map.put(MyEnum.VALUE_ONE, 100);

        // Read the value from the map using the get method
        /* read */ Integer value = map.get(MyEnum.VALUE_ONE);
        
        // Print the value
        System.out.println(value);
    }

    // Define an enum type to be used with EnumHashBiMap
    private enum MyEnum {
        VALUE_ONE,
        VALUE_TWO
    }
}