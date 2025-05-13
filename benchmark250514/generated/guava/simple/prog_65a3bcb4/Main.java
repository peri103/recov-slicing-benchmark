import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

public class Main {
    public static void main(String[] args) {
        Multiset<String> multiset = HashMultiset.create();
        /* write */ multiset.add("example");
        /* read */ int count = multiset.count("example");
        System.out.println(count);
    }
}