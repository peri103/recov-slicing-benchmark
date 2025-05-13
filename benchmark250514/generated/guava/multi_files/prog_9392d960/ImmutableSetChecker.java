import com.google.common.collect.ImmutableSortedSet;

public class ImmutableSetChecker {
    private ImmutableSortedSet<Integer> set;

    public ImmutableSetChecker(ImmutableSortedSet<Integer> set) {
        this.set = set;
    }

    public boolean containsElement(int element) {
        /* read */ return set.contains(element);
    }
}
