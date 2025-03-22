import java.util.TreeSet;

public class CustomSet {
    private TreeSet<Integer> set = new TreeSet<>();

    public void addElement(int element) {
        /* write */ set.add(element);
    }

    public boolean containsElement(int element) {
        return set.contains(element);
    }

    public TreeSet<Integer> getSet() {
        return set;
    }
}
