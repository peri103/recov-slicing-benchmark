import com.google.common.collect.ImmutableBiMap;

public class BiMapHandler {
    private ImmutableBiMap.Builder<String, String> builder = new ImmutableBiMap.Builder<>();

    public void putEntry(String key, String value) {
        /* write */ builder.put(key, value);
    }

    public ImmutableBiMap<String, String> build() {
        return builder.build();
    }
}
