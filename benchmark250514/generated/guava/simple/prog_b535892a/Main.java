import com.google.common.collect.ForwardingMultiset;
import com.google.common.collect.HashMultiset;

public class Main {
    public static void main(String[] args) {
        ForwardingMultiset<String> multiset = new ForwardingMultiset<String>() {
            private final HashMultiset<String> delegate = HashMultiset.create();

            @Override
            protected HashMultiset<String> delegate() {
                return delegate;
            }
        };

        /* write */ multiset.add("apple");
        /* read */ int count = multiset.count("apple");
        System.out.println(count);
    }
}