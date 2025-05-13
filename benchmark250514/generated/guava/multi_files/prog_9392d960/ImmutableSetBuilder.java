import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.ImmutableSortedSet.Builder;

public class ImmutableSetBuilder {
    private Builder<Integer> builder = ImmutableSortedSet.naturalOrder();

    public void addElement(int element) {
        /* write */ builder.add(element);
    }

    public ImmutableSortedSet<Integer> buildSet() {
        return builder.build();
    }
}
