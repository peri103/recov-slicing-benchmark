public class Student {
    private String name;
    private StudentCourses courses = new StudentCourses();

    public Student(String name) {
        this.name = name;
    }

    public void enrollCourse(String courseName) {
        courses.addCourse(courseName);
    }

    public String getCourse(int index) {
        return courses.getCourse(index);
    }

    public int getTotalCourseLength() {
        return courses.getTotalCourseLength();
    }
}
