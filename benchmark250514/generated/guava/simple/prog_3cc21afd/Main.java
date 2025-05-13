import com.google.common.collect.TreeMultiset;

public class Main {
    public static void main(String[] args) {
        TreeMultiset<Integer> multiset = TreeMultiset.create();
        /* write */ multiset.add(42);
        /* read */ int count = multiset.count(42);
        System.out.println(count);
    }
}