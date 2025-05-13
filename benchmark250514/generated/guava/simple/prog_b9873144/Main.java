import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        // Initialize a builder for ImmutableList
        ImmutableList.Builder<Integer> builder = ImmutableList.builder();
        
        // Use the builder to add elements to the list
        /* write */ builder.add(42);
        
        // Build the ImmutableList from the builder
        ImmutableList<Integer> list = builder.build();
        
        // Read the element at index 0 from the ImmutableList
        /* read */ int value = list.get(0);
        
        // Print the read value to ensure correctness
        System.out.println(value);
    }
}