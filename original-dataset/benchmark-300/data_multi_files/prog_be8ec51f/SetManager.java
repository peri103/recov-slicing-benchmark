import java.util.concurrent.CopyOnWriteArraySet;

public class SetManager {
    private CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();

    public void addValue(String value) {
        /* write */ set.add(value);
    }

    public boolean containsValue(String value) {
        return set.contains(value);
    }
}
