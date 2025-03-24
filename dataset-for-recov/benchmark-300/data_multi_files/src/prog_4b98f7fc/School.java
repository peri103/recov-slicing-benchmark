public class School {
    private String schoolName;
    private List<Course> courses = new ArrayList<>();

    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public List<Course> getCourses() {
        return courses;
    }
}