public class Student {
    private String name;
    private StudentCourses courses = new StudentCourses();

    public Student(String name) {
        this.name = name;
    }

    public void enrollCourse(String course) {
        courses.addCourse(course);
    }

    public String getName() {
        return name;
    }

    public StudentCourses getCourses() {
        return courses;
    }
}
