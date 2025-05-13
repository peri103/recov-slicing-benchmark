import com.google.common.collect.ForwardingSet;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> backingSet = new HashSet<>();
        ForwardingSet<Integer> set = new ForwardingSet<Integer>() {
            @Override
            protected Set<Integer> delegate() {
                return backingSet;
            }
        };
        
        /* write */ set.add(42);
        /* read */ boolean contains = set.contains(42);
        System.out.println(contains);
    }
}