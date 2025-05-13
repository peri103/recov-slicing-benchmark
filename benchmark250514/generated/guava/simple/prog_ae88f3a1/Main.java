import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableList
        ImmutableList.Builder<Integer> builder = ImmutableList.builder();
        
        // Add an element to the builder
        /* write */ builder.add(10);
        
        // Build the ImmutableList
        ImmutableList<Integer> immutableList = builder.build();
        
        // Read the value at index 0
        /* read */ int value = immutableList.get(0);
        
        // Print the value
        System.out.println(value);
    }
}