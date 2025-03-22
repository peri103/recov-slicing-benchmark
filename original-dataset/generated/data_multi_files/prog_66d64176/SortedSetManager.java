import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetManager {
    private SortedSet<Integer> sortedSet = new TreeSet<>();

    public void addValue(int value) {
        /* write */ sortedSet.add(value);
    }

    public boolean containsValue(int value) {
        return sortedSet.contains(value);
    }

    public SortedSet<Integer> getSortedSet() {
        return sortedSet;
    }
}
