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

    public void enrollInCourse(String courseName, int grade) {
        course.addGrade(courseName, grade);
    }

    public Integer getCourseGrade(String courseName) {
        return course.getGrade(courseName);
    }
}
