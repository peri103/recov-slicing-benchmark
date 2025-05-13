import com.google.common.collect.ImmutableSortedMap;

public class Course {
    private ImmutableSortedMap.Builder<String, Integer> courseBuilder;

    public Course() {
        this.courseBuilder = ImmutableSortedMap.naturalOrder();
    }

    public void addCourse(String courseName, int credits) {
        /* write */ courseBuilder.put(courseName, credits);
    }

    public ImmutableSortedMap<String, Integer> getCourses() {
        return courseBuilder.build();
    }
}
