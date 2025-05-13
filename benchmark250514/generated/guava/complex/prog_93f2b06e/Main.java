import com.google.common.collect.ForwardingSortedSet;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ForwardingSortedSet<Integer> set = new ForwardingSortedSet<>() {
            private final TreeSet<Integer> delegate = new TreeSet<>();

            @Override
            protected TreeSet<Integer> delegate() {
                return delegate;
            }
        };

        HashSet<Integer> auxiliarySet = new HashSet<>();
        auxiliarySet.add(100);
        auxiliarySet.add(200);
        auxiliarySet.add(300);

        Iterator<Integer> iterator = auxiliarySet.iterator();
        while (iterator.hasNext()) {
            set.add(iterator.next() * 2);
        }

        /* write */ set.add(42);

        int sum = 0;
        for (Integer num : set) {
            sum += num;
        }
        System.out.println("Sum of elements in set: " + sum);

        boolean isPresent = false;
        for (Integer num : auxiliarySet) {
            if (set.contains(num)) {
                isPresent = true;
                break;
            }
        }
        
        /* read */ boolean containsValue = set.contains(42);
        System.out.println("Set contains 42: " + containsValue);

        System.out.println("Auxiliary set contains a value from the main set: " + isPresent);

        for (Integer num : set) {
            System.out.println("Value in set: " + num);
        }
    }
}