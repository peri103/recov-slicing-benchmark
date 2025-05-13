import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableList
        ImmutableList.Builder<Integer> builder = ImmutableList.builder();
        
        // Add an element using the builder
        /* write */ builder.add(42);
        
        // Build the ImmutableList
        ImmutableList<Integer> list = builder.build();
        
        // Read the element from the ImmutableList
        /* read */ int value = list.get(0);
        
        // Print the value
        System.out.println(value);
    }
}