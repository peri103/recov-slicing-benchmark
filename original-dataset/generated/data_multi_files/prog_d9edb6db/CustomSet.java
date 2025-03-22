import java.util.concurrent.ConcurrentSkipListSet;

public class CustomSet {
    private ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();

    public void addElement(int element) {
        /* write */ set.add(element);
    }

    public boolean containsElement(int element) {
        return set.contains(element);
    }

    public ConcurrentSkipListSet<Integer> getSet() {
        return set;
    }
}
