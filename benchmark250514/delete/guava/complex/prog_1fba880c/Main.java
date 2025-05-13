import com.google.common.collect.ImmutableSortedMultiset;
import com.google.common.collect.ImmutableSortedMultiset.Builder;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableListMultimap.Builder as MultimapBuilder;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Builder<Integer> builder = ImmutableSortedMultiset.orderedBy(Comparator.naturalOrder());
        MultimapBuilder<String, Integer> multimapBuilder = ImmutableListMultimap.builder();

        multimapBuilder.put("key1", 100);
        multimapBuilder.put("key2", 200);
        multimapBuilder.put("key3", 300);

        ImmutableListMultimap<String, Integer> multimap = multimapBuilder.build();

        for (String key : multimap.keySet()) {
            System.out.println("Key: " + key + ", Values: " + multimap.get(key));
        }

        /* write */ builder.add(1);

        for (int i = 0; i < 5; i++) {
            builder.add(i * 10);
        }

        ImmutableSortedMultiset<Integer> multiset = builder.build();

        for (Integer value : multiset.elementSet()) {
            System.out.println("Element: " + value + ", Count: " + multiset.count(value));
        }

        /* read */ int count = multiset.count(1);
        System.out.println("Count of 1: " + count);
    }
}