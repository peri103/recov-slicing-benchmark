import com.google.common.collect.ForwardingMultiset;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

public class FruitMultiset {
    private Multiset<String> multiset = HashMultiset.create();
    private ForwardingMultiset<String> forwardingMultiset = new ForwardingMultiset<String>() {
        @Override
        protected Multiset<String> delegate() {
            return multiset;
        }
    };

    public void addFruit(String fruit) {
        /* write */ forwardingMultiset.add(fruit);
    }

    public int countFruit(String fruit) {
        return forwardingMultiset.count(fruit);
    }
}
