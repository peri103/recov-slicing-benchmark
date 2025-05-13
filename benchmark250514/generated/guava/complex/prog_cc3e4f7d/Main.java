import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;
import com.google.common.collect.Range;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        RangeMap<Integer, String> rangeMap = TreeRangeMap.create();
        Map<String, Integer> anotherMap = new HashMap<>();

        // Adding some entries to anotherMap
        anotherMap.put("Alpha", 100);
        anotherMap.put("Beta", 200);

        /* write */ rangeMap.put(Range.closed(1, 10), "Value1");

        // Performing some operations on anotherMap
        for (Map.Entry<String, Integer> entry : anotherMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Adding more ranges to rangeMap
        rangeMap.put(Range.open(10, 20), "Value2");
        rangeMap.put(Range.closedOpen(20, 30), "Value3");

        // Checking if a key exists in anotherMap
        if (anotherMap.containsKey("Alpha")) {
            System.out.println("Alpha exists in anotherMap");
        }

        /* read */ String value = rangeMap.get(5);
        
        System.out.println(value);

        // Further operations with anotherMap
        anotherMap.put("Gamma", 300);
        for (String key : anotherMap.keySet()) {
            System.out.println("Key: " + key);
        }
    }
}