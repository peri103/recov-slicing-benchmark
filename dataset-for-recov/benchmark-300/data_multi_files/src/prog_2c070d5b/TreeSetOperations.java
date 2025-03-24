import java.util.TreeSet;

public class TreeSetOperations {
    private TreeSet<Integer> treeSet = new TreeSet<>();

    public void addValue(int value) {
        /* write */ treeSet.add(value);
    }

    public boolean containsValue(int value) {
        return treeSet.contains(value);
    }

    public TreeSet<Integer> getTreeSet() {
        return treeSet;
    }
}
