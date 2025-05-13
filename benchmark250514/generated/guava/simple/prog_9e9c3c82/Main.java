import com.google.common.collect.ImmutableSortedMap;

public class Main {
    public static void main(String[] args) {
        /* write */ ImmutableSortedMap<String, Integer> map = ImmutableSortedMap.of("key1", 100);
        /* read */ Integer value = map.get("key1");
        System.out.println(value);
    }
}