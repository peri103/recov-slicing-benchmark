public class Course {
    private String courseName;
    private String instructor;
    private ImmutableTable.Builder<String, String, String> courseDetailsBuilder;

    public Course() {
        courseDetailsBuilder = ImmutableTable.builder();
    }

    public void setCourseDetails(String courseName, String instructor) {
        this.courseName = courseName;
        this.instructor = instructor;
        /* write */ courseDetailsBuilder.put(courseName, "Instructor", instructor);
    }

    public String getCourseDetails() {
        ImmutableTable<String, String, String> courseDetails = courseDetailsBuilder.build();
        /* read */ return courseDetails.get(courseName, "Instructor");
    }
}
