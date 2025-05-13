import com.google.common.collect.ForwardingMultiset;
import com.google.common.collect.HashMultiset;

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

        // Use the ForwardingMultiset instance to count the occurrences of the element
        /* read */ int count = forwardingMultiset.count("item");

        // Print the count to verify the read operation
        System.out.println(count);
    }
}