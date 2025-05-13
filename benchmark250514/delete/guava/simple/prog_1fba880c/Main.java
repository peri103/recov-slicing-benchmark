import com.google.common.collect.ImmutableSortedMultiset;
import com.google.common.collect.ImmutableSortedMultiset.Builder;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Builder<Integer> builder = ImmutableSortedMultiset.orderedBy(Comparator.naturalOrder());

        /* write */ builder.add(1);

        ImmutableSortedMultiset<Integer> multiset = builder.build();

        /* read */ int count = multiset.count(1);
        System.out.println(count);
    }
}