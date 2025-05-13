import com.google.common.collect.MutableClassToInstanceMap;
import com.google.common.collect.ClassToInstanceMap;

public class InstanceManager {
    private ClassToInstanceMap<Object> map = MutableClassToInstanceMap.create();

    public void storeInstance(Class<?> clazz, Object instance) {
        /* write */ map.putInstance(clazz, instance);
    }

    public <T> T retrieveInstance(Class<T> clazz) {
        /* read */ return map.getInstance(clazz);
    }
}
