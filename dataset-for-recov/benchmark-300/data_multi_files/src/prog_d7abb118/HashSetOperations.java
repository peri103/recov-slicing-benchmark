import java.util.HashSet;

public class HashSetOperations {
    private HashSet<String> set = new HashSet<>();

    public void addElement(String element) {
        /* write */ set.add(element);
    }

    public boolean containsElement(String element) {
        return set.contains(element);
    }

    public HashSet<String> getSet() {
        return set;
    }
}
