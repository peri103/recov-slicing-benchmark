import com.google.common.collect.MutableClassToInstanceMap;

public class ImmutableDataWriter {
    private MutableClassToInstanceMap<Object> mutableMap = MutableClassToInstanceMap.create();

    public void writeData() {
        /* write */ mutableMap.putInstance(String.class, "Hello, World!");
    }

    public MutableClassToInstanceMap<Object> getMutableMap() {
        return mutableMap;
    }
}