import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.HashMultiset;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a LinkedHashMultiset and add elements
        Multiset<String> multiset = LinkedHashMultiset.create();
        /* write */ multiset.add("example");
        multiset.add("test");
        multiset.add("example");

        // Create another Multiset and add elements
        Multiset<String> anotherMultiset = HashMultiset.create();
        anotherMultiset.add("sample");
        anotherMultiset.add("example");
        anotherMultiset.add("sample");

        // Perform some operations with anotherMultiset
        int sampleCount = anotherMultiset.count("sample");
        System.out.println("Sample count in anotherMultiset: " + sampleCount);

        // Create a Map to store counts
        Map<String, Integer> countMap = new HashMap<>();
        countMap.put("example", multiset.count("example"));
        countMap.put("test", multiset.count("test"));

        // Perform operations on countMap
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Calculate total count of elements in multiset
        int totalCount = 0;
        for (String element : multiset.elementSet()) {
            totalCount += multiset.count(element);
        }
        System.out.println("Total count in multiset: " + totalCount);

        // Retrieve and print the count of "example" from multiset
        /* read */ int count = multiset.count("example");
        System.out.println("Count of 'example' in multiset: " + count);
    }
}