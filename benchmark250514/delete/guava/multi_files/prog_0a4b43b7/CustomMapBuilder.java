import com.google.common.collect.ImmutableClassToInstanceMap;

public class CustomMapBuilder {
    private ImmutableClassToInstanceMap.Builder<Object> builder = ImmutableClassToInstanceMap.builder();

    public void addEntry(Class<?> clazz, Object instance) {
        /* write */ builder.put(clazz, instance);
    }

    public ImmutableClassToInstanceMap<Object> build() {
        return builder.build();
    }
}
