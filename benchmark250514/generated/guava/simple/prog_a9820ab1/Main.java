import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        // Initialize a builder for ImmutableList since ImmutableList does not support direct mutation
        ImmutableList.Builder<Integer> builder = ImmutableList.builder();
        
        /* write */ builder.add(1);
        
        // Build the immutable list
        ImmutableList<Integer> list = builder.build();
        
        /* read */ int value = list.get(0);
        
        System.out.println(value);
    }
}