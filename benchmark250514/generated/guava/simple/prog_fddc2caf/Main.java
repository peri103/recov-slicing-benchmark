import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;

public class Main {
    public static void main(String[] args) {
        RangeMap<Integer, String> rangeMap = TreeRangeMap.create();
        
        // Define a range and a value to associate with it
        Range<Integer> range = Range.closed(1, 10);
        String valueToWrite = "Hello, World!";
        
        /* write */ rangeMap.put(range, valueToWrite);
        
        // Retrieve the value associated with a specific key within the range
        int keyToRead = 5;
        /* read */ String valueRead = rangeMap.get(keyToRead);
        
        System.out.println(valueRead);
    }
}