import java.util.HashSet;

public class HashSetManager {
    private HashSet<String> set = new HashSet<>();

    public void addValue(String value) {
        /* write */ set.add(value);
    }

    public boolean containsValue(String value) {
        return set.contains(value);
    }
}
