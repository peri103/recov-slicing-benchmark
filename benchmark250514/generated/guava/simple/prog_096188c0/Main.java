import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;

public class Main {
    public static void main(String[] args) {
        Builder<Integer> builder = ImmutableSet.builder();
        /* write */ builder.add(1);
        ImmutableSet<Integer> immutableSet = builder.build();
        /* read */ boolean containsValue = immutableSet.contains(1);
        System.out.println(containsValue);
    }
}