public class Student {
    private String name;
    private Course course;

    public Student(String name) {
        this.name = name;
        this.course = new Course();
    }

    public void enrollCourse(String courseName) {
        course.setCourseName(courseName);
    }

    public void addGrade(int grade) {
        course.addGrade(grade);
    }

    public String getName() {
        return name;
    }

    public Course getCourse() {
        return course;
    }
}
