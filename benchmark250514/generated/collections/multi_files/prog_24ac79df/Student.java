public class Student {
    private String name;
    private Course course;

    public Student(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    public void enrollInCourse(String courseName) {
        course.setCourseName(courseName);
    }

    public String getCourseName() {
        return course.getCourseName();
    }

    public String getName() {
        return name;
    }
}
