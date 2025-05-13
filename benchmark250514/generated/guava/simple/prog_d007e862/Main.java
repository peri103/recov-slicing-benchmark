import com.google.common.collect.ForwardingSortedSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        SortedSet<Integer> baseSet = new TreeSet<>();
        ForwardingSortedSet<Integer> forwardingSet = new ForwardingSortedSet<Integer>() {
            @Override
            protected SortedSet<Integer> delegate() {
                return baseSet;
            }
        };

        /* write */ forwardingSet.add(42);
        /* read */ boolean containsValue = forwardingSet.contains(42);
        System.out.println(containsValue);
    }
}