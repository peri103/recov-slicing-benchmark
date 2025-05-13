import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;

public class Main {
    public static void main(String[] args) {
        Builder<String> builder = ImmutableSet.builder();
        /* write */ builder.add("example");
        ImmutableSet<String> set = builder.build();
        /* read */ boolean contains = set.contains("example");
        System.out.println(contains);
    }
}