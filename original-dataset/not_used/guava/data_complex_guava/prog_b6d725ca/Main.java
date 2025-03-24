import com.google.common.collect.TreeRangeMap;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        TreeRangeMap<Integer, String> rangeMap = TreeRangeMap.create();
        /* write */ rangeMap.put(Range.closed(1, 5), "Value1");
        
        // Additional unrelated code to increase complexity
        HashMap<String, Integer> hashMap = new HashMap<>();
        ArrayList<String> stringList = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            hashMap.put("Key" + i, i * 10);
            stringList.add("String" + i);
        }
        
        // Manipulating the hashMap
        for (String key : hashMap.keySet()) {
            System.out.println(key + ": " + hashMap.get(key));
        }
        
        // Using the ArrayList
        for (String str : stringList) {
            System.out.println(str);
        }
        
        // More unrelated operations
        int sum = 0;
        for (int value : hashMap.values()) {
            sum += value;
        }
        System.out.println("Sum of values in HashMap: " + sum);
        
        /* read */ String value = rangeMap.get(3);
        System.out.println(value);
    }
}