import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class MultimapBuilder {
    private Builder<String, String> builder = ImmutableMultimap.builder();

    public void addEntry(String key, String value) {
        /* write */ builder.put(key, value);
    }

    public ImmutableMultimap<String, String> build() {
        return builder.build();
    }
}
