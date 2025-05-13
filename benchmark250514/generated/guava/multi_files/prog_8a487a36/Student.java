public class Student {
    private String name;
    private Course course;

    public Student(String name) {
        this.name = name;
        this.course = new Course();
    }

    public void enrollCourse(String courseName) {
        course.addCourse(courseName);
    }

    public String getFirstCourse() {
        return course.getFirstCourse();
    }
}
