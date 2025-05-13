import com.google.common.collect.ForwardingSet;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> backingSet = new HashSet<>();
        ForwardingSet<Integer> set = new ForwardingSet<Integer>() {
            @Override
            protected Set<Integer> delegate() {
                return backingSet;
            }
        };

        Set<String> stringSet = new TreeSet<>();
        stringSet.add("Hello");
        stringSet.add("World");
        
        for (String str : stringSet) {
            System.out.println(str);
        }

        /* write */ set.add(42);

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers: " + sum);

        if (sum > 50) {
            System.out.println("Sum is greater than 50");
        } else {
            System.out.println("Sum is less than or equal to 50");
        }

        /* read */ boolean contains = set.contains(42);
        System.out.println(contains);

        Set<Double> doubleSet = new HashSet<>();
        for (double d = 0.5; d <= 5.0; d += 0.5) {
            doubleSet.add(d);
        }

        for (Double d : doubleSet) {
            System.out.println("Double value: " + d);
        }
    }
}