import com.google.common.collect.ImmutableSet;

public class Main {
    public static void main(String[] args) {
        ImmutableSet.Builder<String> builder = ImmutableSet.builder();
        /* write */ builder.add("example");
        ImmutableSet<String> set = builder.build();
        /* read */ boolean contains = set.contains("example");
        System.out.println(contains);
    }
}