import com.google.common.collect.ImmutableClassToInstanceMap;

public class CustomMapReader {
    private ImmutableClassToInstanceMap<Object> map;

    public CustomMapReader(ImmutableClassToInstanceMap<Object> map) {
        this.map = map;
    }

    public <T> T getInstance(Class<T> clazz) {
        /* read */ return map.getInstance(clazz);
    }
}
