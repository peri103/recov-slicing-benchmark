import com.google.common.collect.HashMultiset;

public class Main {
    public static void main(String[] args) {
        HashMultiset<String> multiset = HashMultiset.create();
        /* write */ multiset.add("apple");
        /* read */ int count = multiset.count("apple");
        System.out.println(count);
    }
}