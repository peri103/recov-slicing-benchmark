import com.google.common.collect.TreeMultiset;

public class Main {
    public static void main(String[] args) {
        TreeMultiset<Integer> multiset = TreeMultiset.create();
        /* write */ multiset.add(5);
        /* read */ int count = multiset.count(5);
        System.out.println(count);
    }
}