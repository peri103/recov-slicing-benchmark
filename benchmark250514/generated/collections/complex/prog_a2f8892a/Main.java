import org.apache.commons.collections4.map.LazyMap;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        LazyMap<String, Integer> lazyMap = LazyMap.lazyMap(map, key -> 0);
        
        // Additional LazyMap usage
        Map<String, String> stringMap = new HashMap<>();
        LazyMap<String, String> lazyStringMap = LazyMap.lazyMap(stringMap, key -> "default");

        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numberList.add(i * 10);
        }

        // Some operations on numberList
        int sum = 0;
        for (int num : numberList) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        /* write */ lazyMap.put("key1", 42);

        // More operations on numberList
        for (int i = 0; i < numberList.size(); i++) {
            numberList.set(i, numberList.get(i) + 1);
        }

        // Use another LazyMap
        lazyStringMap.put("hello", "world");
        System.out.println("LazyMap string value: " + lazyStringMap.get("hello"));
        System.out.println("LazyMap default value: " + lazyStringMap.get("unknown"));

        // Final operation on numberList
        for (int num : numberList) {
            System.out.println("Modified number: " + num);
        }

        /* read */ int value = lazyMap.get("key1");
        System.out.println("LazyMap integer value: " + value);
    }
}