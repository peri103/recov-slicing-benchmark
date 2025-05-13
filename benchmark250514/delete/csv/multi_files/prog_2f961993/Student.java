public class Student {
    private String name;
    private Course course;

    public Student(String name) {
        this.name = name;
        this.course = new Course();
    }

    public void enroll(String courseName) {
        course.addCourse(courseName);
    }

    public Course getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }
}
