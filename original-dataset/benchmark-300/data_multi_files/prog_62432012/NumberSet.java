import java.util.SortedSet;
import java.util.TreeSet;

public class NumberSet {
    private SortedSet<Integer> set = new TreeSet<>();

    public void addNumber(int number) {
        /* write */ set.add(number);
    }

    public boolean containsNumber(int number) {
        return set.contains(number);
    }
}
