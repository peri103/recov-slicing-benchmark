import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableClassToInstanceMap.Builder;

public class Course {
    private String courseName;
    private ImmutableClassToInstanceMap<Object> instanceMap;

    public Course(String courseName) {
        this.courseName = courseName;
        this.instanceMap = buildInstanceMap();
    }

    private ImmutableClassToInstanceMap<Object> buildInstanceMap() {
        Builder<Object> builder = ImmutableClassToInstanceMap.builder();
        /* write */ return builder.putInstance(Integer.class, 42).build();
    }

    public ImmutableClassToInstanceMap<Object> getInstanceMap() {
        return instanceMap;
    }

    public String getCourseName() {
        return courseName;
    }
}
