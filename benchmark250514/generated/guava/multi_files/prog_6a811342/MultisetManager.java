import com.google.common.collect.TreeMultiset;

public class MultisetManager {
    private TreeMultiset<Integer> multiset = TreeMultiset.create();

    public void addElement(int element) {
        /* write */ multiset.add(element);
    }

    public int getElementCount(int element) {
        return multiset.count(element);
    }

    public int getTotalElements() {
        int total = 0;
        for (Integer elem : multiset.elementSet()) {
            total += multiset.count(elem);
        }
        return total;
    }
}
