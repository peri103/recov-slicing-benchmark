public class Student {
    private String name;
    private Course course;

    public Student(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void enrollInCourse(Course newCourse) {
        this.course = newCourse;
    }

    public Course getCourse() {
        return course;
    }
}
