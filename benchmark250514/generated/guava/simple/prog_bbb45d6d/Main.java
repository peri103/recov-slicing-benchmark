import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableList
        ImmutableList.Builder<Integer> builder = ImmutableList.builder();
        
        // Write a value to the builder
        /* write */ builder.add(42);
        
        // Build the ImmutableList
        ImmutableList<Integer> immutableList = builder.build();
        
        // Read the value from the ImmutableList
        /* read */ int value = immutableList.get(0);
        
        // Output the read value
        System.out.println(value);
    }
}