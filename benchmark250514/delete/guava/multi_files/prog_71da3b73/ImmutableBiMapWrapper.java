import com.google.common.collect.ImmutableBiMap;

public class ImmutableBiMapWrapper {
    private ImmutableBiMap.Builder<String, Integer> builder = ImmutableBiMap.builder();
    private ImmutableBiMap<String, Integer> biMap;

    public void addEntry(String key, Integer value) {
        /* write */ builder.put(key, value);
        biMap = builder.build();
    }

    public Integer getValue(String key) {
        return biMap.get(key);
    }
}
