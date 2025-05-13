import com.google.common.collect.ImmutableSortedMap;

public class ImmutableMapBuilder {
    private ImmutableSortedMap.Builder<String, Integer> builder = ImmutableSortedMap.naturalOrder();

    public void addEntry(String key, Integer value) {
        /* write */ builder.put(key, value);
    }

    public ImmutableSortedMap<String, Integer> build() {
        return builder.build();
    }
}
