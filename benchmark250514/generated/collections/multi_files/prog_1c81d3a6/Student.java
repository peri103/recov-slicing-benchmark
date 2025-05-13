public class Student {
    private String name;
    private Course course;

    public Student(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    public void enroll(String courseName) {
        course.addStudent(this, courseName);
    }

    public String getName() {
        return name;
    }

    public Course getCourse() {
        return course;
    }
}
