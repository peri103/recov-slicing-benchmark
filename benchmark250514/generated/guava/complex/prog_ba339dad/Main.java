import com.google.common.collect.ForwardingMultiset;
import com.google.common.collect.HashMultiset;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Initialize a HashMultiset instance which will be wrapped by ForwardingMultiset
        HashMultiset<String> multiset = HashMultiset.create();

        // Create a ForwardingMultiset instance
        ForwardingMultiset<String> forwardingMultiset = new ForwardingMultiset<String>() {
            @Override
            protected HashMultiset<String> delegate() {
                return multiset;
            }
        };

        // Use the ForwardingMultiset instance to add an element
        /* write */ forwardingMultiset.add("item");

        // Add more elements to the multiset
        forwardingMultiset.add("item2");
        forwardingMultiset.add("item3");

        // Perform unrelated operations
        HashMap<String, Integer> map = new HashMap<>();
        map.put("key1", 10);
        map.put("key2", 20);
        map.put("key3", 30);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Perform operations on a different collection
        List<String> list = new ArrayList<>();
        list.add("element1");
        list.add("element2");
        list.add("element3");

        for (String element : list) {
            System.out.println(element);
        }

        // Use the ForwardingMultiset instance to count the occurrences of the original element
        /* read */ int count = forwardingMultiset.count("item");

        // Print the count to verify the read operation
        System.out.println(count);

        // Perform additional operations on the multiset
        System.out.println("Total unique items in multiset: " + forwardingMultiset.elementSet().size());
        for (String element : forwardingMultiset.elementSet()) {
            System.out.println(element + " occurs " + forwardingMultiset.count(element) + " times");
        }
    }
}