import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableClassToInstanceMap.Builder;

public class Course {
    private String courseName;
    private Builder<Object> builder = ImmutableClassToInstanceMap.builder();
    private ImmutableClassToInstanceMap<Object> map;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addCourseDetails(String detail) {
        /* write */ map = builder.put(String.class, detail).build();
    }

    public String getCourseDetail() {
        /* read */ return map.getInstance(String.class);
    }
}
