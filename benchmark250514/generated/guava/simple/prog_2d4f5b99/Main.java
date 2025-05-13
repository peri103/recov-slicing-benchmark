import com.google.common.collect.ForwardingSortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        ForwardingSortedSet<Integer> set = new ForwardingSortedSet<Integer>() {
            private final TreeSet<Integer> delegate = new TreeSet<>();

            @Override
            protected TreeSet<Integer> delegate() {
                return delegate;
            }
        };

        /* write */ set.add(42);
        /* read */ boolean containsValue = set.contains(42);
        System.out.println(containsValue);
    }
}