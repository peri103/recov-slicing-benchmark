import com.google.common.collect.ForwardingMultiset;
import com.google.common.collect.HashMultiset;

public class Main {
    public static void main(String[] args) {
        ForwardingMultiset<String> multiset = new HashMultiset<String>() {
            @Override
            protected HashMultiset<String> delegate() {
                return HashMultiset.create();
            }
        };
        
        /* write */ multiset.add("apple");
        /* read */ int count = multiset.count("apple");
        
        System.out.println(count);
    }
}