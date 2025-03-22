import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetOperations {
    private SortedSet<Integer> sortedSet = new TreeSet<>();

    public void addNumber(int number) {
        /* write */ sortedSet.add(number);
    }

    public boolean containsNumber(int number) {
        return sortedSet.contains(number);
    }

    public SortedSet<Integer> getSortedSet() {
        return sortedSet;
    }
}
