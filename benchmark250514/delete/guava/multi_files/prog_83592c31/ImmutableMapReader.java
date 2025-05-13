import com.google.common.collect.ImmutableClassToInstanceMap;

public class ImmutableMapReader {
    private ImmutableClassToInstanceMap<Object> map;

    public ImmutableMapReader(ImmutableClassToInstanceMap<Object> map) {
        this.map = map;
    }

    public String getStringInstance() {
        /* read */ return map.getInstance(String.class);
    }

    public Integer getIntegerInstance() {
        return map.getInstance(Integer.class);
    }

    public Double getDoubleInstance() {
        return map.getInstance(Double.class);
    }
}
