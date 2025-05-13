import com.google.common.collect.ForwardingSortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Initialize a TreeSet to be wrapped by ForwardingSortedSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        
        // Create an anonymous class extending ForwardingSortedSet
        ForwardingSortedSet<Integer> forwardingSortedSet = new ForwardingSortedSet<Integer>() {
            @Override
            protected TreeSet<Integer> delegate() {
                return treeSet;
            }
        };
        
        /* write */ forwardingSortedSet.add(42);
        /* read */ boolean containsValue = forwardingSortedSet.contains(42);
        
        System.out.println("Contains 42: " + containsValue);
    }
}