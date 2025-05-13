import com.google.common.collect.ImmutableBiMap;

public class Main {
    public static void main(String[] args) {
        ImmutableBiMap.Builder<String, String> builder = new ImmutableBiMap.Builder<>();
        /* write */ builder.put("key", "value");
        ImmutableBiMap<String, String> biMap = builder.build();
        /* read */ String value = biMap.get("key");
        System.out.println(value);
    }
}