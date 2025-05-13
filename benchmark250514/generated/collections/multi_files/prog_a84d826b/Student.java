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

    public String getCourseName() {
        return course.getCourseName();
    }

    public void addScore(String subject, int score) {
        course.addScore(subject, score);
    }

    public Integer getScore(String subject) {
        return course.getScore(subject);
    }
}
