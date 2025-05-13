import com.google.common.collect.ImmutableBiMap;

public class BiMapBuilder {
    private ImmutableBiMap.Builder<String, Integer> builder;

    public BiMapBuilder() {
        builder = ImmutableBiMap.builder();
    }

    public void addEntry(String key, Integer value) {
        /* write */ builder.put(key, value);
    }

    public ImmutableBiMap<String, Integer> build() {
        return builder.build();
    }
}
