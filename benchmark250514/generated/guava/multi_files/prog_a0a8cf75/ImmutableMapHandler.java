import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableClassToInstanceMap.Builder;

public class ImmutableMapHandler {
    private ImmutableClassToInstanceMap<Object> map;

    public void buildMap() {
        Builder<Object> builder = ImmutableClassToInstanceMap.builder();
        builder.put(String.class, "Hello, Immutable World!");
        /* write */ map = builder.build();
    }

    public String getStringInstance() {
        /* read */ return map.getInstance(String.class);
    }
}
