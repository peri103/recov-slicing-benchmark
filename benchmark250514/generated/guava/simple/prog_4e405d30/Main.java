import com.google.common.collect.ImmutableBiMap;

public class Main {
    public static void main(String[] args) {
        ImmutableBiMap<String, Integer> map = ImmutableBiMap.<String, Integer>builder()
            /* write */ .put("one", 1)
            .put("two", 2)
            .put("three", 3)
            .build();
        
        /* read */ Integer value = map.get("one");
        System.out.println(value);
    }
}