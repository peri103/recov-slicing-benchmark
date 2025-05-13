public class Student {
    private String name;
    private Course course;

    public Student(String name) {
        this.name = name;
    }

    public void enrollCourse(Course course) {
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }
}
