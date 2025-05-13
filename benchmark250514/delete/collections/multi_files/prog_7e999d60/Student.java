public class Student {
    private String name;
    private Course course;

    public Student(String name) {
        this.name = name;
        this.course = new Course();
    }

    public void enroll(String courseName) {
        course.setCourseName(courseName);
    }

    public String getCourseName() {
        return course.getCourseName();
    }

    public void setGrade(String courseName, String grade) {
        course.setGrade(courseName, grade);
    }

    public String getGrade(String courseName) {
        return course.getGrade(courseName);
    }
}
