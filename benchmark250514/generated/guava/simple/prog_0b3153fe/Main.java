import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableBiMap.Builder;

public class Main {
    public static void main(String[] args) {
        Builder<String, Integer> builder = ImmutableBiMap.builder();
        /* write */ builder.put("key1", 100);
        ImmutableBiMap<String, Integer> biMap = builder.build();
        /* read */ Integer value = biMap.get("key1");
        System.out.println(value);
    }
}