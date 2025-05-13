import com.google.common.collect.ImmutableMultiset;

public class Main {
    public static void main(String[] args) {
        // Create an ImmutableMultiset instance using the 'of' method
        /* write */ ImmutableMultiset<String> multiset = ImmutableMultiset.of("apple", "banana", "apple");
        
        // Read the count of "apple" using the 'count' method
        /* read */ int appleCount = multiset.count("apple");
        
        // Print the count of "apple"
        System.out.println(appleCount);
    }
}