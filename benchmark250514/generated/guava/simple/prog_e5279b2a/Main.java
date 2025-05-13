import com.google.common.collect.ImmutableBiMap;

public class Main {
    public static void main(String[] args) {
        /* write */ ImmutableBiMap<String, Integer> map = ImmutableBiMap.of("key", 42);
        /* read */ Integer value = map.get("key");
        System.out.println(value);
    }
}