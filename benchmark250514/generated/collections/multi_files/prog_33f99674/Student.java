public class Student {
    private String name;
    private Course course;

    public Student(String name) {
        this.name = name;
        this.course = new Course("Math");
    }

    public void enrollInCourse(String courseName) {
        this.course = new Course(courseName);
    }

    public Course getCourse() {
        return this.course;
    }

    public String getName() {
        return this.name;
    }
}
