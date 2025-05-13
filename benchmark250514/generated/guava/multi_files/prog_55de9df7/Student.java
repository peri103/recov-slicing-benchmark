public class Student {
    private String name;
    private Course course;

    public Student(String name) {
        this.name = name;
        this.course = new Course();
    }

    public void enrollInCourse(String courseName) {
        course.setCourseName(courseName);
    }

    public void attendClass(String className) {
        course.addClassAttended(className);
    }

    public String getCourseName() {
        return course.getCourseName();
    }

    public int getClassAttendanceCount(String className) {
        return course.getClassAttendanceCount(className);
    }
}
