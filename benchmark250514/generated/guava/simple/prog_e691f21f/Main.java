import com.google.common.collect.ImmutableSortedMultiset;
import com.google.common.collect.ImmutableSortedMultiset.Builder;

public class Main {
    public static void main(String[] args) {
        Builder<Integer> builder = ImmutableSortedMultiset.naturalOrder();
        /* write */ builder.add(1);
        ImmutableSortedMultiset<Integer> multiset = builder.build();
        /* read */ int count = multiset.count(1);
        System.out.println(count);
    }
}