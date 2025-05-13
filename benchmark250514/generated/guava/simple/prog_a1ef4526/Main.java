import com.google.common.collect.TreeMultiset;

public class Main {
    public static void main(String[] args) {
        TreeMultiset<String> multiset = TreeMultiset.create();
        /* write */ multiset.add("example");
        /* read */ int count = multiset.count("example");
        System.out.println(count);
    }
}