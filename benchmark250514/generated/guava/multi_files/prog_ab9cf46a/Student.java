public class Student {
    private String name;
    private Course course;

    public Student(String name) {
        this.name = name;
        this.course = new Course();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(String courseName) {
        course.setCourseName(courseName);
    }

    public String getEnrolledCourse() {
        return course.getCourseName();
    }

    public void addGrade(String subject, int grade) {
        course.addGrade(subject, grade);
    }

    public int getGrade(String subject) {
        return course.getGrade(subject);
    }
}
