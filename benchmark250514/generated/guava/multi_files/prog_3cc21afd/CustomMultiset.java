import com.google.common.collect.TreeMultiset;

public class CustomMultiset {
    private TreeMultiset<Integer> multiset = TreeMultiset.create();

    public void addElement(int element) {
        /* write */ multiset.add(element);
    }

    public int countElement(int element) {
        return multiset.count(element);
    }
}
