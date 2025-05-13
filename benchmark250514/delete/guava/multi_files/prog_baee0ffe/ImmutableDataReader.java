import com.google.common.collect.ImmutableClassToInstanceMap;

public class ImmutableDataReader {
    private ImmutableClassToInstanceMap<Object> immutableMap;

    public ImmutableDataReader(MutableClassToInstanceMap<Object> mutableMap) {
        immutableMap = ImmutableClassToInstanceMap.copyOf(mutableMap);
    }

    public String readData() {
        /* read */ return immutableMap.getInstance(String.class);
    }
}