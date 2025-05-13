import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;

public class Main {
    public static void main(String[] args) {
        Builder<Integer> builder = ImmutableSet.builder();
        /* write */ builder.add(1);
        ImmutableSet<Integer> set = builder.build();
        /* read */ boolean containsValue = set.contains(1);
        System.out.println(containsValue);
    }
}