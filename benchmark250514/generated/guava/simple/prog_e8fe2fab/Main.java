import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;

public class Main {
    public static void main(String[] args) {
        Builder<String> builder = ImmutableSet.builder();
        /* write */ builder.add("Hello");
        ImmutableSet<String> immutableSet = builder.build();
        /* read */ boolean containsHello = immutableSet.contains("Hello");
        System.out.println(containsHello);
    }
}