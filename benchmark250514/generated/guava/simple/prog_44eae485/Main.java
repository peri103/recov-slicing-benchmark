import com.google.common.collect.ImmutableSortedSet;

public class Main {
    public static void main(String[] args) {
        ImmutableSortedSet.Builder<Integer> builder = ImmutableSortedSet.naturalOrder();
        /* write */ builder.add(42);
        ImmutableSortedSet<Integer> set = builder.build();
        /* read */ boolean containsValue = set.contains(42);
        System.out.println(containsValue);
    }
}