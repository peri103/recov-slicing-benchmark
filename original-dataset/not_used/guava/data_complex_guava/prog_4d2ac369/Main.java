import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import com.google.common.collect.RangeMapBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RangeMap<Integer, String> rangeMap = RangeMapBuilder.<Integer, String>create();
        /* write */ rangeMap.put(Range.closed(1, 5), "Value1");

        // Adding more complexity
        HashMap<String, Integer> hashMap = new HashMap<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            hashMap.put("Key" + i, i);
            list.add("Item" + i);
        }

        // Processing the HashMap
        for (String key : hashMap.keySet()) {
            System.out.println(key + ": " + hashMap.get(key));
        }

        // Working with the list
        for (String item : list) {
            System.out.println(item);
        }

        // Additional unrelated operations
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first 5 numbers: " + sum);

        /* read */ String value = rangeMap.get(3);
        System.out.println(value);
    }
}