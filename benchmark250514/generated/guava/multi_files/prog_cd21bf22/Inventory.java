import com.google.common.collect.ConcurrentHashMultiset;

public class Inventory {
    private ConcurrentHashMultiset<String> multiset;

    public Inventory() {
        multiset = ConcurrentHashMultiset.create();
    }

    public void addItem(String item) {
        /* write */ multiset.add(item);
    }

    public int getItemCount(String item) {
        return multiset.count(item);
    }
}
