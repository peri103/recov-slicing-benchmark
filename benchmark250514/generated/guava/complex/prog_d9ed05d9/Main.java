import com.google.common.collect.EnumHashBiMap;
import com.google.common.collect.HashBiMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        EnumHashBiMap<MyEnum, Integer> map = EnumHashBiMap.create(MyEnum.class);
        HashBiMap<String, String> biMap = HashBiMap.create();
        Map<String, Integer> hashMap = new HashMap<>();

        // Working with HashBiMap
        biMap.put("key1", "value1");
        biMap.put("key2", "value2");
        System.out.println("BiMap value for key1: " + biMap.get("key1"));

        // Working with HashMap
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        int sum = 0;
        for (String key : hashMap.keySet()) {
            sum += hashMap.get(key);
        }
        System.out.println("Sum of HashMap values: " + sum);

        // Original EnumHashBiMap write operation
        /* write */ map.put(MyEnum.VALUE_ONE, 100);

        // Additional EnumHashBiMap operations
        map.put(MyEnum.VALUE_TWO, 200);
        int total = 0;
        for (MyEnum key : map.keySet()) {
            total += map.get(key);
        }
        System.out.println("Total of EnumHashBiMap values: " + total);

        // Original EnumHashBiMap read operation
        /* read */ Integer value = map.get(MyEnum.VALUE_ONE);
        System.out.println(value);

        // Additional operations with EnumHashBiMap
        map.put(MyEnum.VALUE_TWO, 300);
        for (MyEnum key : map.keySet()) {
            System.out.println("EnumHashBiMap value for " + key + ": " + map.get(key));
        }
    }

    private enum MyEnum {
        VALUE_ONE, VALUE_TWO
    }
}