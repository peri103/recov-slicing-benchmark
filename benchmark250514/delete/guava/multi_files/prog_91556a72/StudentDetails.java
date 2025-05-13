import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableClassToInstanceMap.Builder;

public class StudentDetails {
    private Builder<Object> builder = ImmutableClassToInstanceMap.builder();
    private ImmutableClassToInstanceMap<Object> map;

    public StudentDetails(int age) {
        /* write */ builder.putInstance(Integer.class, age);
    }

    public void setDetail(Class<?> type, Object instance) {
        builder.putInstance(type, instance);
        map = builder.build();
    }

    public Object getDetail(Class<?> type) {
        if (map == null) {
            map = builder.build();
        }
        return map.getInstance(type);
    }
}
