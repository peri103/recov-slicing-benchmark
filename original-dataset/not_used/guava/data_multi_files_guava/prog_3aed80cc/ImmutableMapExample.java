import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;

public class ImmutableMapExample {
    private Builder<String, Integer> builder = ImmutableMap.builder();

    public void addEntry(String key, Integer value) {
        /* write */ builder.put(key, value);
    }

    public ImmutableMap<String, Integer> buildMap() {
        return builder.build();
    }
}
