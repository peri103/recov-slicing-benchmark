import com.google.common.collect.Range;
import com.google.common.collect.TreeRangeSet;
import com.google.common.collect.RangeSet;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        TreeRangeSet<Integer> rangeSet = TreeRangeSet.create();
        RangeSet<Integer> anotherRangeSet = TreeRangeSet.create();
        Map<String, Integer> sampleMap = new HashMap<>();
        
        sampleMap.put("One", 1);
        sampleMap.put("Two", 2);
        sampleMap.put("Three", 3);

        anotherRangeSet.add(Range.closed(20, 30));
        anotherRangeSet.add(Range.closed(40, 50));
        
        /* write */ rangeSet.add(Range.closed(1, 10));

        for (Map.Entry<String, Integer> entry : sampleMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        boolean isInAnotherRangeSet = anotherRangeSet.contains(25);
        System.out.println("Is 25 in anotherRangeSet? " + isInAnotherRangeSet);

        for (int i = 0; i < 15; i++) {
            boolean isInRangeSet = rangeSet.contains(i);
            System.out.println("Is " + i + " in rangeSet? " + isInRangeSet);
        }

        /* read */ boolean containsValue = rangeSet.contains(5);
        System.out.println("Does rangeSet contain 5? " + containsValue);

        anotherRangeSet.add(Range.closed(60, 70));
        for (int i = 20; i < 80; i += 10) {
            boolean isInAnotherRangeSetAgain = anotherRangeSet.contains(i);
            System.out.println("Is " + i + " in anotherRangeSet? " + isInAnotherRangeSetAgain);
        }
    }
}