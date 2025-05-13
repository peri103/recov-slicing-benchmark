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

    public String getCourseName() {
        return course.getCourseName();
    }

    public void addGrade(String subject, int grade) {
        course.addGrade(subject, grade);
    }

    public int getGrade(String subject) {
        return course.getGrade(subject);
    }

    public String getName() {
        return name;
    }
}
