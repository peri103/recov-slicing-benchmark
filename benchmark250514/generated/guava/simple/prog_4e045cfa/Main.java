import com.google.common.collect.ImmutableSortedSet;

public class Main {
    public static void main(String[] args) {
        ImmutableSortedSet.Builder<Integer> builder = ImmutableSortedSet.builder();
        /* write */ builder.add(42);
        ImmutableSortedSet<Integer> sortedSet = builder.build();
        /* read */ boolean containsValue = sortedSet.contains(42);
        System.out.println(containsValue);
    }
}