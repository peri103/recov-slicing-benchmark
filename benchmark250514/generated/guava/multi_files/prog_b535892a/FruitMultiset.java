import com.google.common.collect.ForwardingMultiset;
import com.google.common.collect.HashMultiset;

public class FruitMultiset extends ForwardingMultiset<String> {
    private final HashMultiset<String> delegate = HashMultiset.create();

    @Override
    protected HashMultiset<String> delegate() {
        return delegate;
    }

    public void addFruit(String fruit) {
        /* write */ add(fruit);
    }
}
