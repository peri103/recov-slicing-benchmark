import com.google.common.collect.RangeSet;
import com.google.common.collect.TreeRangeSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        RangeSet<Integer> rangeSet = TreeRangeSet.create();
        /* write */ rangeSet.add(com.google.common.collect.Range.closed(1, 5));
        boolean containsValue = rangeSet.contains(3);
        System.out.println("RangeSet contains 3: " + containsValue);
        
        // Additional complex code
        ArrayList<String> stringList = new ArrayList<>();
        HashMap<String, Integer> stringLengthMap = new HashMap<>();
        
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");
        
        for (String str : stringList) {
            stringLengthMap.put(str, str.length());
        }
        
        for (Map.Entry<String, Integer> entry : stringLengthMap.entrySet()) {
            System.out.println(entry.getKey() + " has length: " + entry.getValue());
        }
        
        // More code to manipulate the RangeSet
        rangeSet.add(com.google.common.collect.Range.closed(6, 10));
        System.out.println("RangeSet after adding more ranges: " + rangeSet.asRanges());
        
        // Using the rangeSet in a different context
        if (rangeSet.contains(7)) {
            System.out.println("RangeSet contains 7.");
        } else {
            System.out.println("RangeSet does not contain 7.");
        }
        
        // Final read operation
        System.out.println("Final check for 3 in RangeSet: " + rangeSet.contains(3));
    }
}