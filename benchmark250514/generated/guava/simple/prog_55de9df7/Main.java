import com.google.common.collect.LinkedHashMultiset;

public class Main {
    public static void main(String[] args) {
        LinkedHashMultiset<String> multiset = LinkedHashMultiset.create();
        /* write */ multiset.add("example");
        /* read */ int count = multiset.count("example");
        System.out.println(count);
    }
}