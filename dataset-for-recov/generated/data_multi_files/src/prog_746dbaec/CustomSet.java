import java.util.concurrent.CopyOnWriteArraySet;

public class CustomSet {
    private CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();

    public void addValue(int value) {
        /* write */ set.add(value);
    }

    public boolean containsValue(int value) {
        return set.contains(value);
    }
}