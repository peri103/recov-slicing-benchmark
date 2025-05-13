import com.google.common.collect.ImmutableSortedSet;

public class ImmutableSetOperations {
    private ImmutableSortedSet.Builder<Integer> builder = ImmutableSortedSet.naturalOrder();

    public void addElement(int element) {
        /* write */ builder.add(element);
    }

    public ImmutableSortedSet<Integer> buildSet() {
        return builder.build();
    }
}
