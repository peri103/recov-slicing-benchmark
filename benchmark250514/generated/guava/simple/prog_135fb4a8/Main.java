import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.ImmutableSortedSet.Builder;

public class Main {
    public static void main(String[] args) {
        Builder<Integer> builder = ImmutableSortedSet.naturalOrder();
        /* write */ builder.add(5);
        ImmutableSortedSet<Integer> set = builder.build();
        /* read */ boolean containsValue = set.contains(5);
        System.out.println(containsValue);
    }
}