import com.google.common.collect.SortedMultiset;
import com.google.common.collect.TreeMultiset;

public class Main {
    public static void main(String[] args) {
        SortedMultiset<String> multiset = TreeMultiset.create();
        /* write */ multiset.add("apple");
        /* read */ int count = multiset.count("apple");
        System.out.println(count);
    }
}