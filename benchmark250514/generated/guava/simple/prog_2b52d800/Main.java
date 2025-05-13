import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.ImmutableSortedSet.Builder;

public class Main {
    public static void main(String[] args) {
        Builder<Integer> builder = ImmutableSortedSet.naturalOrder();
        /* write */ builder.add(1);
        ImmutableSortedSet<Integer> set = builder.build();
        /* read */ boolean contains = set.contains(1);
        System.out.println(contains);
    }
}