import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        // ImmutableList does not support add operation directly as it is immutable,
        // hence we need to use a builder to add elements.
        ImmutableList.Builder<Integer> builder = ImmutableList.builder();
        /* write */ builder.add(1);
        
        // Build the immutable list
        ImmutableList<Integer> list = builder.build();
        
        /* read */ int value = list.get(0);
        System.out.println(value);
    }
}