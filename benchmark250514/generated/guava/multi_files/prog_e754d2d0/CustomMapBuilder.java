import com.google.common.collect.ImmutableClassToInstanceMap;

public class CustomMapBuilder {
    private ImmutableClassToInstanceMap.Builder<Object> builder;

    public CustomMapBuilder() {
        builder = ImmutableClassToInstanceMap.builder();
    }

    public void addStringInstance(String value) {
        /* write */ builder.put(String.class, value);
    }

    public ImmutableClassToInstanceMap<Object> build() {
        return builder.build();
    }
}
