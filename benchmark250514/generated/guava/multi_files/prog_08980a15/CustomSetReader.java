import com.google.common.collect.ImmutableSortedSet;

public class CustomSetReader {
    private ImmutableSortedSet<Integer> set;

    public CustomSetReader(ImmutableSortedSet<Integer> set) {
        this.set = set;
    }

    public boolean containsElement(int element) {
        /* read */ return set.contains(element);
    }
}
