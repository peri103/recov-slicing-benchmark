import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multiset;

public class Main {
    public static void main(String[] args) {
        Multiset<String> multiset = LinkedHashMultiset.create();
        /* write */ multiset.add("apple");
        /* read */ int count = multiset.count("apple");
        System.out.println(count);
    }
}