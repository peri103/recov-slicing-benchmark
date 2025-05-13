import com.google.common.collect.HashMultiset;
import com.google.common.collect.ForwardingMultiset;
import com.google.common.collect.Multiset;

public class Main {
    public static void main(String[] args) {
        ForwardingMultiset<String> multiset = new ForwardingMultiset<String>() {
            private final HashMultiset<String> delegate = HashMultiset.create();

            @Override
            protected HashMultiset<String> delegate() {
                return delegate;
            }
        };

        // Additional unrelated code to make the program more complex
        Multiset<String> anotherMultiset = HashMultiset.create();
        anotherMultiset.add("banana");
        anotherMultiset.add("banana");
        anotherMultiset.add("orange");

        int bananaCount = anotherMultiset.count("banana");
        System.out.println("Banana count: " + bananaCount);

        // Some more operations on anotherMultiset
        anotherMultiset.remove("banana");
        System.out.println("Banana count after removal: " + anotherMultiset.count("banana"));

        // Operations on the original multiset
        multiset.add("banana");
        multiset.add("orange");
        multiset.add("apple");
        
        /* write */ multiset.add("apple");
        
        // More operations on multiset
        multiset.add("apple");
        multiset.add("grape");
        multiset.remove("orange");

        int grapeCount = multiset.count("grape");
        System.out.println("Grape count: " + grapeCount);

        // Operations on anotherMultiset
        anotherMultiset.add("grape");
        anotherMultiset.add("grape");

        int grapeCountAnother = anotherMultiset.count("grape");
        System.out.println("Grape count in anotherMultiset: " + grapeCountAnother);

        /* read */ int count = multiset.count("apple");
        System.out.println("Apple count in original multiset: " + count);
        
        // Final operations
        multiset.add("banana");
        multiset.remove("banana");
        System.out.println("Banana count in original multiset: " + multiset.count("banana"));
    }
}