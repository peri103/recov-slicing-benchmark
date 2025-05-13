import com.google.common.collect.ImmutableSortedMultiset;
import com.google.common.collect.ImmutableSortedMultiset.Builder;

public class ImmutableSortedMultisetWrapper {
    private Builder<Integer> builder = ImmutableSortedMultiset.naturalOrder();

    public void addElement(int element) {
        /* write */ builder.add(element);
    }

    public ImmutableSortedMultiset<Integer> buildMultiset() {
        return builder.build();
    }
}
