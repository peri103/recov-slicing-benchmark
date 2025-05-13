public class Student {
    private int id;
    private String name;
    private CourseTable courseTable = new CourseTable();

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void enrollCourse(int courseId, String courseName) {
        courseTable.addCourse(this.id, courseId, courseName);
    }

    public String getCourseName(int courseId) {
        return courseTable.getCourse(this.id, courseId);
    }
}
