import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        ImmutableRangeMap.Builder<Integer, String> builder = new ImmutableRangeMap.Builder<>();
        /* write */ builder.put(Range.closed(1, 10), "Value1");
        
        ImmutableList<String> immutableList = ImmutableList.of("Element1", "Element2", "Element3");
        ImmutableMap<Integer, String> immutableMap = ImmutableMap.of(1, "One", 2, "Two", 3, "Three");

        System.out.println("ImmutableList elements:");
        for (String element : immutableList) {
            System.out.println(element);
        }

        System.out.println("ImmutableMap elements:");
        for (Integer key : immutableMap.keySet()) {
            System.out.println(key + " -> " + immutableMap.get(key));
        }

        ImmutableRangeMap<Integer, String> rangeMap = builder.build();
        
        int testValue = 5;
        if (rangeMap.get(testValue) != null) {
            /* read */ String value = rangeMap.get(testValue);
            System.out.println("RangeMap value for " + testValue + ": " + value);
        } else {
            System.out.println("No value found in RangeMap for " + testValue);
        }

        ImmutableList<Integer> numbers = ImmutableList.of(10, 20, 30, 40, 50);
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        ImmutableMap<String, Integer> wordCountMap = ImmutableMap.of("apple", 3, "banana", 5, "cherry", 2);
        int totalWords = 0;
        for (String word : wordCountMap.keySet()) {
            totalWords += wordCountMap.get(word);
        }
        System.out.println("Total word count: " + totalWords);
    }
}