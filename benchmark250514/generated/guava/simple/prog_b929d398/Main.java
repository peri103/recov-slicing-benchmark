import com.google.common.collect.ImmutableSortedSet;

public class Main {
    public static void main(String[] args) {
        // Initialize the ImmutableSortedSet using its builder
        ImmutableSortedSet.Builder<Integer> builder = ImmutableSortedSet.builder();
        
        /* write */ builder.add(1);
        
        // Build the ImmutableSortedSet
        ImmutableSortedSet<Integer> set = builder.build();
        
        /* read */ boolean containsValue = set.contains(1);
        
        System.out.println(containsValue); // This should print true
    }
}