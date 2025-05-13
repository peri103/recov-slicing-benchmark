import com.google.common.collect.ImmutableBiMap;

public class Main {
    public static void main(String[] args) {
        ImmutableBiMap<String, Integer> biMap = ImmutableBiMap.<String, Integer>builder()
            /* write */ .put("key", 1)
            .build();
        
        /* read */ Integer value = biMap.get("key");
        System.out.println(value);
    }
}