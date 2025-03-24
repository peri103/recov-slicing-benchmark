import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetManager {
    private SortedSet<Integer> set = new TreeSet<>();

    public void addValue(int value) {
        /* write */ set.add(value);
    }

    public SortedSet<Integer> getSet() {
        return set;
    }
}
