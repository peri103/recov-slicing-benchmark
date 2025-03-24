import java.util.HashSet;

public class HashSetOperations {
    private HashSet<String> set = new HashSet<>();

    public void addToSet(String value) {
        /* write */ set.add(value);
    }

    public boolean containsInSet(String value) {
        return set.contains(value);
    }
}
