import com.google.common.collect.ImmutableSortedSet;

public class Main {
    public static void main(String[] args) {
        ImmutableSortedSet.Builder<Integer> builder = ImmutableSortedSet.naturalOrder();
        /* write */ builder.add(1);
        ImmutableSortedSet<Integer> set = builder.build();
        /* read */ boolean contains = set.contains(1);
        System.out.println(contains);
    }
}