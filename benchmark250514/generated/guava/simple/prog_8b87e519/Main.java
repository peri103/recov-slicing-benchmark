import com.google.common.collect.ImmutableBiMap;

public class Main {
    public static void main(String[] args) {
        ImmutableBiMap.Builder<String, Integer> builder = ImmutableBiMap.builder();
        /* write */ builder.put("one", 1);
        ImmutableBiMap<String, Integer> biMap = builder.build();
        /* read */ Integer value = biMap.get("one");
        System.out.println(value);
    }
}