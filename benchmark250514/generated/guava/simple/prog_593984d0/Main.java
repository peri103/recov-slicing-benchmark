import com.google.common.collect.LinkedHashMultiset;

public class Main {
    public static void main(String[] args) {
        LinkedHashMultiset<Integer> multiset = LinkedHashMultiset.create();
        /* write */ multiset.add(42);
        /* read */ int count = multiset.count(42);
        System.out.println(count);
    }
}