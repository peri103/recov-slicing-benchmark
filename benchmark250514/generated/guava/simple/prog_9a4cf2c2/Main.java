import com.google.common.collect.ImmutableMultiset;

public class Main {
    public static void main(String[] args) {
        ImmutableMultiset.Builder<String> builder = ImmutableMultiset.builder();
        /* write */ builder.add("apple");
        
        ImmutableMultiset<String> multiset = builder.build();
        /* read */ int count = multiset.count("apple");
        
        System.out.println(count);
    }
}