import com.google.common.collect.ImmutableSortedSet;

public class Main {
    public static void main(String[] args) {
        ImmutableSortedSet.Builder<Integer> builder = ImmutableSortedSet.<Integer>naturalOrder();
        /* write */ builder.add(1);
        ImmutableSortedSet<Integer> sortedSet = builder.build();
        /* read */ boolean containsValue = sortedSet.contains(1);
        System.out.println(containsValue);
    }
}