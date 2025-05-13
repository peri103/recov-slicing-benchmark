import com.google.common.collect.ImmutableSortedMultiset;
import com.google.common.collect.ImmutableSortedMultiset.Builder;

public class Main {
    public static void main(String[] args) {
        Builder<String> builder = ImmutableSortedMultiset.naturalOrder();
        /* write */ builder.add("example");
        ImmutableSortedMultiset<String> multiset = builder.build();
        /* read */ int count = multiset.count("example");
        System.out.println(count);
    }
}