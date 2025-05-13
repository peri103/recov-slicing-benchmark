import com.google.common.collect.ForwardingSet;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> baseSet = new HashSet<>();
        ForwardingSet<Integer> forwardingSet = new ForwardingSet<Integer>() {
            @Override
            protected Set<Integer> delegate() {
                return baseSet;
            }
        };

        /* write */ forwardingSet.add(42);
        /* read */ boolean containsValue = forwardingSet.contains(42);
        System.out.println(containsValue);
    }
}