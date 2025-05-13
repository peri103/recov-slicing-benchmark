public class Student {
    private int id;
    private String name;
    private Course course;

    public Student(int id, String name, Course course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public void enrollInCourse() {
        course.enrollStudent(id, name);
    }

    public String getCourseName() {
        return course.getCourseName();
    }

    public String getEnrolledStudentName() {
        return course.getStudentName(id);
    }
}
