public class Student {
    private String name;
    private int age;
    private StudentCourses courses;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.courses = new StudentCourses();
    }

    public void enrollCourse(String courseName) {
        courses.addCourse(courseName);
    }

    public boolean isEnrolled(String courseName) {
        return courses.isCourseEnrolled(courseName);
    }
}
