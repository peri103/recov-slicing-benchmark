import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Multiset<String> multiset = HashMultiset.create();
        Set<String> uniqueSet = new HashSet<>();

        // Adding elements to the unique set
        uniqueSet.add("unique1");
        uniqueSet.add("unique2");
        uniqueSet.add("unique3");

        // Adding elements to the multiset
        multiset.add("example");
        multiset.add("example2");
        multiset.add("example3");

        // Perform some operations on the unique set
        for (String item : uniqueSet) {
            System.out.println("Unique item: " + item);
        }

        // Adding more elements to the multiset
        multiset.add("example");
        multiset.add("example2");

        // Perform operations on the multiset
        for (String item : multiset.elementSet()) {
            System.out.println("Multiset item: " + item + ", count: " + multiset.count(item));
        }

        // Further operations
        uniqueSet.remove("unique2");
        System.out.println("Unique set size: " + uniqueSet.size());

        // More operations on the multiset
        multiset.remove("example3", 2);

        /* write */ multiset.add("example");
        
        // Additional logic
        int totalCount = 0;
        for (String item : multiset.elementSet()) {
            totalCount += multiset.count(item);
        }
        System.out.println("Total count in multiset: " + totalCount);

        /* read */ int count = multiset.count("example");
        System.out.println("Count of 'example': " + count);

        // Final operations
        uniqueSet.clear();
        System.out.println("Unique set cleared, size: " + uniqueSet.size());
    }
}