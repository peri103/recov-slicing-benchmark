import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableSortedMap.Builder;

public class Main {
    public static void main(String[] args) {
        Builder<Integer, String> builder = ImmutableSortedMap.<Integer, String>naturalOrder();
        /* write */ builder.put(1, "One");
        ImmutableSortedMap<Integer, String> map = builder.build();
        /* read */ String value = map.get(1);
        System.out.println(value);
    }
}