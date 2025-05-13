import com.google.common.collect.ForwardingSet;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> baseSet = new HashSet<>();
        ForwardingSet<String> forwardingSet = new ForwardingSet<String>() {
            @Override
            protected Set<String> delegate() {
                return baseSet;
            }
        };
        
        // Adding multiple elements to the forwarding set
        forwardingSet.add("first");
        forwardingSet.add("second");
        forwardingSet.add("third");
        
        /* write */ forwardingSet.add("example");
        
        // Perform some unrelated operations
        Set<String> anotherSet = new HashSet<>();
        anotherSet.add("fourth");
        anotherSet.add("fifth");
        
        for (String item : anotherSet) {
            forwardingSet.add(item);
        }
        
        // Check if specific elements exist in the set
        boolean containsFirst = forwardingSet.contains("first");
        boolean containsFourth = forwardingSet.contains("fourth");
        
        System.out.println("Contains 'first': " + containsFirst);
        System.out.println("Contains 'fourth': " + containsFourth);
        
        // Perform some more operations
        forwardingSet.remove("second");
        forwardingSet.add("sixth");
        
        /* read */ boolean containsValue = forwardingSet.contains("example");
        
        // Print the final result of the original write-read pair
        System.out.println("Contains 'example': " + containsValue);
        
        // Display all elements in the forwarding set
        for (String item : forwardingSet) {
            System.out.println("Element: " + item);
        }
    }
}