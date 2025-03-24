import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetOperations {
    private SortedSet<Integer> set = new TreeSet<>();

    public void addElement(int element) {
        /* write */ set.add(element);
    }

    public boolean containsElement(int element) {
        return set.contains(element);
    }

    public SortedSet<Integer> getSet() {
        return set;
    }
}
