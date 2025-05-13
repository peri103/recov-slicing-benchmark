public class Student {
    private String name;
    private StudentCourses courses = new StudentCourses();

    public Student(String name) {
        this.name = name;
    }

    public void enrollCourse(String courseName, int score) {
        courses.addCourse(courseName, score);
    }

    public StudentCourses getCourses() {
        return courses;
    }
}
