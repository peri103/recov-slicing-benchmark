public class Student {
    private String name;
    private StudentCourses courses;

    public Student(String name) {
        this.name = name;
        this.courses = new StudentCourses();
    }

    public void enrollCourse(String courseName) {
        courses.addCourse(courseName);
    }

    public String getName() {
        return name;
    }

    public StudentCourses getCourses() {
        return courses;
    }
}
