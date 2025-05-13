import com.google.common.collect.ForwardingSet;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Create an anonymous class extending ForwardingSet
        ForwardingSet<Integer> set = new ForwardingSet<Integer>() {
            private final Set<Integer> delegate = new HashSet<Integer>();

            @Override
            protected Set<Integer> delegate() {
                return delegate;
            }
        };

        /* write */ set.add(42); // Use the add method to write the value

        /* read */ boolean containsValue = set.contains(42); // Use the contains method to read the value

        System.out.println("Contains 42: " + containsValue);
    }
}