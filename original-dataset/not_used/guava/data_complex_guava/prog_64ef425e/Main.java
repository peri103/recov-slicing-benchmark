import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.ImmutableRangeSet.Builder;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Builder<Integer> builder = ImmutableRangeSet.builder();
        /* write */ builder.add(Range.closed(1, 5));
        ImmutableRangeSet<Integer> rangeSet = builder.build();
        
        // Additional unrelated code to increase complexity
        HashMap<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        
        ArrayList<String> keys = new ArrayList<>(map.keySet());
        for (String key : keys) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
        
        // More unrelated operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 10; i <= 50; i += 10) {
            numbers.add(i);
        }
        
        System.out.println("Numbers: " + numbers);
        
        /* read */ boolean containsValue = rangeSet.contains(3);
        System.out.println("Does the range set contain 3? " + containsValue);
    }
}