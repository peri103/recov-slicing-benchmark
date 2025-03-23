import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableSortedMap.Builder;

public class ImmutableMapBuilder {
    private Builder<Integer, String> builder = ImmutableSortedMap.<Integer, String>naturalOrder();

    public void addEntry(int key, String value) {
        /* write */ builder.put(key, value);
    }

    public ImmutableSortedMap<Integer, String> buildMap() {
        return builder.build();
    }
}
