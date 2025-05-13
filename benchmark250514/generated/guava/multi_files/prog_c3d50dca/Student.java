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

    public void enrollInCourse(String courseName) {
        course.addCourse(courseName);
    }

    public String getCourseName() {
        return course.getCourseName();
    }
}
