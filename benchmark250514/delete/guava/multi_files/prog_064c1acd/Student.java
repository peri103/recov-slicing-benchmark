public class Student {
    private String name;
    private Course course;

    public Student(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    public void enrollInCourse() {
        course.addStudent(this);
    }

    public String getName() {
        return name;
    }
}
