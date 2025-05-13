import com.google.common.collect.ImmutableSortedMultiset;

public class Main {
    public static void main(String[] args) {
        // Create a builder for the ImmutableSortedMultiset
        ImmutableSortedMultiset.Builder<Integer> builder = ImmutableSortedMultiset.<Integer>naturalOrder();
        /* write */ builder.add(1);
        
        // Build the ImmutableSortedMultiset
        ImmutableSortedMultiset<Integer> multiset = builder.build();
        
        /* read */ int count = multiset.count(1);
        System.out.println(count);
    }
}