import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;

public class Main {
    public static void main(String[] args) {
        Builder<String> builder = ImmutableSet.builder();
        /* write */ builder.add("Hello");
        ImmutableSet<String> set = builder.build();
        /* read */ boolean contains = set.contains("Hello");
        System.out.println(contains);
    }
}