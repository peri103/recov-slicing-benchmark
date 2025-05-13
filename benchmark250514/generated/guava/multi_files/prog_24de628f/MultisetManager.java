import com.google.common.collect.LinkedHashMultiset;

public class MultisetManager {
    private LinkedHashMultiset<String> multiset = LinkedHashMultiset.create();

    public void addItem(String item) {
        /* write */ multiset.add(item);
    }

    public int getItemCount(String item) {
        return multiset.count(item);
    }
}
