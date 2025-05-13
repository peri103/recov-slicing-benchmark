import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.MutableClassToInstanceMap;

public class Student {
    private String name;
    private MutableClassToInstanceMap<Object> mutableMap = MutableClassToInstanceMap.create();

    public Student(String name) {
        this.name = name;
    }

    public void addInstance(Class<?> clazz, Object instance) {
        /* write */ mutableMap.putInstance(clazz, instance);
    }

    public ImmutableClassToInstanceMap<Object> getImmutableMap() {
        return ImmutableClassToInstanceMap.copyOf(mutableMap);
    }

    public String getName() {
        return name;
    }
}
