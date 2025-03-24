import java.util.TreeSet;

public class TreeSetManager {
    private TreeSet<Integer> set = new TreeSet<>();

    public void addValue(int value) {
        /* write */ set.add(value);
    }

    public boolean containsValue(int value) {
        return set.contains(value);
    }
}
