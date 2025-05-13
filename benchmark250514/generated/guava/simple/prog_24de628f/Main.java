import com.google.common.collect.LinkedHashMultiset;

public class Main {
    public static void main(String[] args) {
        LinkedHashMultiset<String> multiset = LinkedHashMultiset.create();
        /* write */ multiset.add("apple");
        /* read */ int count = multiset.count("apple");
        System.out.println(count);
    }
}