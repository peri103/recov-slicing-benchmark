import com.google.common.collect.ForwardingSortedSet;
import java.util.TreeSet;
import java.util.SortedSet;

public class Main {
    public static void main(String[] args) {
        // Create a concrete implementation of ForwardingSortedSet
        ForwardingSortedSet<Integer> forwardingSortedSet = new ForwardingSortedSet<Integer>() {
            private final SortedSet<Integer> delegate = new TreeSet<>();

            @Override
            protected SortedSet<Integer> delegate() {
                return delegate;
            }
        };

        /* write */ forwardingSortedSet.add(5);
        /* read */ boolean containsValue = forwardingSortedSet.contains(5);
        System.out.println(containsValue);
    }
}