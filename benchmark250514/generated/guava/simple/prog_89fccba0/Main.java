import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableMultiset.Builder;

public class Main {
    public static void main(String[] args) {
        Builder<String> builder = new ImmutableMultiset.Builder<>();
        /* write */ builder.add("apple");
        ImmutableMultiset<String> multiset = builder.build();
        /* read */ int count = multiset.count("apple");
        System.out.println(count);
    }
}