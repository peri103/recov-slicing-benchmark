import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        // Create an ImmutableList builder
        ImmutableList.Builder<Integer> builder = ImmutableList.builder();
        /* write */ builder.add(42);
        
        // Build the ImmutableList
        ImmutableList<Integer> list = builder.build();
        
        /* read */ int value = list.get(0);
        System.out.println(value);
    }
}