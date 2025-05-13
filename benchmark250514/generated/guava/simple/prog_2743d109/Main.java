import com.google.common.collect.ForwardingSet;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Creating an anonymous subclass of ForwardingSet to override the delegate() method
        ForwardingSet<Integer> forwardingSet = new ForwardingSet<Integer>() {
            private final Set<Integer> delegate = new HashSet<>();

            @Override
            protected Set<Integer> delegate() {
                return delegate;
            }
        };

        /* write */ forwardingSet.add(42);
        /* read */ boolean containsValue = forwardingSet.contains(42);
        System.out.println(containsValue);
    }
}