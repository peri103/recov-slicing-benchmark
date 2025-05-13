import com.google.common.collect.ForwardingMultiset;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

public class Main {
    public static void main(String[] args) {
        Multiset<String> multiset = HashMultiset.create();
        ForwardingMultiset<String> forwardingMultiset = new ForwardingMultiset<String>() {
            @Override
            protected Multiset<String> delegate() {
                return multiset;
            }
        };

        /* write */ forwardingMultiset.add("apple");
        /* read */ int count = forwardingMultiset.count("apple");
        System.out.println(count);
    }
}