import com.google.common.collect.ImmutableClassToInstanceMap;

public class CustomMapReader {
    private ImmutableClassToInstanceMap<Object> map;

    public CustomMapReader(ImmutableClassToInstanceMap<Object> map) {
        this.map = map;
    }

    public String getStringInstance() {
        /* read */ return map.getInstance(String.class);
    }
}
