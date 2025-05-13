import com.google.common.collect.TreeMultiset;

public class MultisetWrapper {
    private TreeMultiset<Integer> multiset = TreeMultiset.create();

    public void addElement(int element) {
        /* write */ multiset.add(element);
    }

    public int getElementCount(int element) {
        return multiset.count(element);
    }
}
