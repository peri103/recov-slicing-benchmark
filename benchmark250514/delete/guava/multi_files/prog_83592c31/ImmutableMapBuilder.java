import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableClassToInstanceMap.Builder;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapBuilder {
    private Builder<Object> builder;
    private Map<Class<?>, Object> additionalValues;

    public ImmutableMapBuilder() {
        builder = ImmutableClassToInstanceMap.builder();
        additionalValues = new HashMap<>();
    }

    public void addValue(Class<?> clazz, Object instance) {
        /* write */ builder.put(clazz, instance);
    }

    public void addAdditionalValues() {
        additionalValues.put(Integer.class, 123);
        additionalValues.put(Double.class, 456.78);
        for (Map.Entry<Class<?>, Object> entry : additionalValues.entrySet()) {
            builder.put(entry.getKey(), entry.getValue());
        }
    }

    public ImmutableClassToInstanceMap<Object> buildMap() {
        return builder.build();
    }
}
