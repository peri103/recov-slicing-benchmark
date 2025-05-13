import com.google.common.collect.ImmutableClassToInstanceMap;

public class Course {
    private ImmutableClassToInstanceMap<String> courseDetails;

    public Course(String courseName) {
        /* write */ this.courseDetails = ImmutableClassToInstanceMap.of(String.class, courseName);
    }

    public String getCourseName() {
        /* read */ return courseDetails.getInstance(String.class);
    }
}