import com.google.common.collect.ImmutableSortedMultiset;

public class Main {
    public static void main(String[] args) {
        ImmutableSortedMultiset.Builder<Integer> builder = ImmutableSortedMultiset.<Integer>naturalOrder();
        /* write */ builder.add(1, 2); // Add element '1' with a count of '2'
        ImmutableSortedMultiset<Integer> multiset = builder.build();
        /* read */ int count = multiset.count(1); // Get the count of element '1'
        System.out.println(count);
    }
}