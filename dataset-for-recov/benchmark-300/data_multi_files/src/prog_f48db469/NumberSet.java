import java.util.TreeSet;

public class NumberSet {
    private TreeSet<Integer> set = new TreeSet<>();

    public void addNumber(int number) {
        /* write */ set.add(number);
    }

    public boolean containsNumber(int number) {
        return set.contains(number);
    }

    public TreeSet<Integer> getSet() {
        return set;
    }
}
