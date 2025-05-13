public class Student {
    private String name;
    private Course course;

    public Student(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    public void enroll(String courseName) {
        this.course.setCourseName(courseName);
    }

    public String getCourseName() {
        return this.course.getCourseName();
    }
}
