import com.google.common.collect.ConcurrentHashMultiset;

public class Main {
    public static void main(String[] args) {
        ConcurrentHashMultiset<String> multiset = ConcurrentHashMultiset.create();
        /* write */ multiset.add("apple");
        /* read */ int count = multiset.count("apple");
        System.out.println(count);
    }
}