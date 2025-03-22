import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetManager {
    private SortedSet<Integer> sortedSet = new TreeSet<>();

    public void addElement(int element) {
        /* write */ sortedSet.add(element);
    }

    public boolean containsElement(int element) {
        return sortedSet.contains(element);
    }

    public SortedSet<Integer> getSortedSet() {
        return sortedSet;
    }
}
