import com.google.common.collect.TreeMultiset;

public class Main {
    public static void main(String[] args) {
        TreeMultiset<String> multiset = TreeMultiset.create();
        /* write */ multiset.add("apple");
        /* read */ int count = multiset.count("apple");
        System.out.println(count);
    }
}