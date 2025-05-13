import com.google.common.collect.TreeMultiset;

public class Main {
    public static void main(String[] args) {
        TreeMultiset<Integer> multiset = TreeMultiset.create();
        /* write */ multiset.add(10);
        /* read */ int count = multiset.count(10);
        System.out.println(count);
    }
}