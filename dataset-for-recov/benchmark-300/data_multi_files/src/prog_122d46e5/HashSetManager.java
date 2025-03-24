import java.util.HashSet;

public class HashSetManager {
    private HashSet<String> set = new HashSet<>();

    public void addElement(String element) {
        /* write */ set.add(element);
    }

    public boolean containsElement(String element) {
        return set.contains(element);
    }
}
