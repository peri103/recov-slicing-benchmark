import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.ImmutableSortedSet.Builder;

public class Main {
    public static void main(String[] args) {
        Builder<Integer> builder = ImmutableSortedSet.naturalOrder();
        /* write */ builder.add(42);
        ImmutableSortedSet<Integer> sortedSet = builder.build();
        /* read */ boolean containsValue = sortedSet.contains(42);
        System.out.println(containsValue);
    }
}