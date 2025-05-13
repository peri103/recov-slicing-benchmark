import com.google.common.collect.ImmutableBiMap;

public class Main {
    public static void main(String[] args) {
        ImmutableBiMap.Builder<String, Integer> builder = new ImmutableBiMap.Builder<>();
        /* write */ builder.put("key1", 100);
        ImmutableBiMap<String, Integer> biMap = builder.build();
        /* read */ Integer value = biMap.get("key1");
        System.out.println(value);
    }
}