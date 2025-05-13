public class Student {
    private String name;
    private Course course;

    public Student(String name) {
        this.name = name;
        this.course = new Course("Math");
    }

    public String getName() {
        return name;
    }

    public void enrollInCourse(String courseName) {
        this.course = new Course(courseName);
    }

    public Course getCourse() {
        return course;
    }
}
