public class Student {
    private String name;
    private Course course;

    public Student(String name) {
        this.name = name;
        this.course = new Course();
    }

    public String getName() {
        return name;
    }

    public void enroll(String courseName, int credits) {
        course.addCourse(courseName, credits);
    }

    public Course getCourse() {
        return course;
    }
}
